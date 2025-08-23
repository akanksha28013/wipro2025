package com.wipro.productmgmt2.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productmgmt2.entity.Order;
import com.wipro.productmgmt2.entity.Product;
import com.wipro.productmgmt2.repo.OrderRepo;
import com.wipro.productmgmt2.repo.ProductRepo;
import com.wipro.productmgmt2.service.OrderService;
import java.time.LocalDateTime;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order placeOrder(int productId, int qty) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        int available = product.getQty() == null ? 0 : product.getQty();
        if (qty <= 0) {
            throw new RuntimeException("Purchase quantity must be greater than 0");
        }
        if (qty > available) {
            throw new RuntimeException("Not enough stock available");
        }

        product.setQty(available - qty);
        productRepo.save(product);

        Order order = new Order();
        order.setProduct(product);
        order.setQty(qty);
        order.setOrderDate(LocalDateTime.now());

        return orderRepo.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}