package com.wipro.ecoorderms.kafka;


import com.wipro.ecoorderms.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderEventProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    private static final String ORDER_TO_PRODUCT_TOPIC = "ordertoproduct";

    
    public void publishOrderCreated(Order order) {
        kafkaTemplate.send(ORDER_TO_PRODUCT_TOPIC, "order-created", order);
        System.out.println("📤 Published OrderCreated event for orderId=" + order.getId());
    }

   
    public void publishOrderCancelled(Order order) {
        kafkaTemplate.send(ORDER_TO_PRODUCT_TOPIC, "order-cancelled", order);
        System.out.println("📤 Published OrderCancelled event for orderId=" + order.getId());
    }
}

