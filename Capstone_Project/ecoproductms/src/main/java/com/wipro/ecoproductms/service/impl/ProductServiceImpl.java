package com.wipro.ecoproductms.service.impl;



import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.ecoproductms.dto.OrderDto;
import com.wipro.ecoproductms.entity.Product;
import com.wipro.ecoproductms.repo.ProductRepo;
import com.wipro.ecoproductms.service.ProductService;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    private static final String PRODUCT_TO_ORDER_TOPIC = "producttoorder";

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void updateStock(int productId, int newQty) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setAvailableQty(newQty);
        productRepo.save(product);

      
        try {
            OrderDto orderEvent = new OrderDto();
            orderEvent.setOrderStatus("STOCK_UPDATED");
            orderEvent.setProductQuantityMap(Map.of(productId, newQty));

            String message = objectMapper.writeValueAsString(orderEvent);
            kafkaTemplate.send(PRODUCT_TO_ORDER_TOPIC, message);

            System.out.println("📤 [ProductMS] Published stock update: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void decreaseStock(int productId, int qty) {
        Product product = productRepo.findById(productId).orElseThrow();
        product.setAvailableQty(product.getAvailableQty() - qty);
        productRepo.save(product);
    }

    public void increaseStock(int productId, int qty) {
        Product product = productRepo.findById(productId).orElseThrow();
        product.setAvailableQty(product.getAvailableQty() + qty);
        productRepo.save(product);
    }
}
