package com.wipro.ecoproductms.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.ecoproductms.dto.OrderDto;
import com.wipro.ecoproductms.service.ProductService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductEventConsumer {

    private final ProductService productService;
    private final ObjectMapper objectMapper;

    public ProductEventConsumer(ProductService productService, ObjectMapper objectMapper) {
        this.productService = productService;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "ordertoproduct", groupId = "ecom-group")
    public void consumeOrderEvent(String message) {
        try {
            System.out.println("[ProductMS] Consumed order event: " + message);

            OrderDto order = objectMapper.readValue(message, OrderDto.class);

            order.getProductQuantityMap().forEach((productId, qty) -> {
                if ("NEW".equals(order.getOrderStatus())) {
                    productService.decreaseStock(productId, qty);
                } else if ("CANCELLED".equals(order.getOrderStatus())) {
                    productService.increaseStock(productId, qty);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

