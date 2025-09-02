package com.wipro.ecoorderms.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.ecoorderms.entity.Order;
import com.wipro.ecoorderms.service.OrderService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    private final OrderService orderService;
    private final ObjectMapper objectMapper;

    public OrderEventConsumer(OrderService orderService, ObjectMapper objectMapper) {
        this.orderService = orderService;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "producttoorder", groupId = "ecom-group")
    public void consumeProductEvent(String message) {
        try {
            System.out.println(" [OrderMS] Consumed product event: " + message);

            Order order = objectMapper.readValue(message, Order.class);

            orderService.updateOrderStatus(order.getId(), "CONFIRMED");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

