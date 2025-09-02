package com.wipro.ecoorderms.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.wipro.ecoorderms.client.ProductClient;
import com.wipro.ecoorderms.dto.ProductDto;
import com.wipro.ecoorderms.entity.Cart;
import com.wipro.ecoorderms.entity.Order;
import com.wipro.ecoorderms.kafka.OrderEventProducer;
import com.wipro.ecoorderms.repo.CartRepo;
import com.wipro.ecoorderms.repo.OrderRepo;
import com.wipro.ecoorderms.service.OrderService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;
    private final CartRepo cartRepo;
    private final ProductClient productClient;
    private final OrderEventProducer orderEventProducer; 

    @Override
    public Order createOrder(int userId) {
        Cart cart = cartRepo.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("No cart found for user " + userId));

        if (cart.getProdDetails().isEmpty()) {
            throw new RuntimeException("Cart is empty! Cannot place order.");
        }

        double totalAmount = 0.0;
        for (Map.Entry<Integer, Integer> entry : cart.getProdDetails().entrySet()) {
            int productId = entry.getKey();
            int qty = entry.getValue();

            ProductDto product = productClient.getProductById(productId);

            if (product.getAvailableQty() < qty) {
                throw new RuntimeException("Quantity not available for product: " + product.getProdName());
            }

            totalAmount += qty * product.getPrice();

            int newQty = product.getAvailableQty() - qty;
            productClient.updateStock(productId, newQty);
        }

        Order order = new Order();
        order.setUserId(userId);
        order.setProductQuantityMap(new HashMap<>(cart.getProdDetails()));
        order.setTotalAmount(totalAmount);
        order.setOrderStatus("NEW");
        order.setOrderDate(LocalDateTime.now());

        Order savedOrder = orderRepo.save(order);

        cartRepo.delete(cart);

        orderEventProducer.publishOrderCreated(savedOrder);

        return savedOrder;
    }
    @Override
    public Order updateOrderStatus(int orderId, String status) {
        Order order = orderRepo.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + orderId));
        order.setOrderStatus(status);
        return orderRepo.save(order);
    }

    @Override
    public Order cancelOrder(int orderId) {
        Order order = orderRepo.findById(orderId).orElseThrow();
        order.setOrderStatus("CANCELLED");
        orderRepo.save(order);
        orderEventProducer.publishOrderCancelled(order);
        for (Map.Entry<Integer, Integer> entry : order.getProductQuantityMap().entrySet()) {
            int productId = entry.getKey();
            int qty = entry.getValue();

            ProductDto product = productClient.getProductById(productId);
            int newQty = product.getAvailableQty() + qty;
            productClient.updateStock(productId, newQty);
        }

        return order;
    }


    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public List<Order> getOrdersByUser(int userId) {
        return orderRepo.findByUserId(userId);
    }

    @Override
    public Order getOrderById(int orderId) {
        return orderRepo.findById(orderId).orElseThrow();
    }
}