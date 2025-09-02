package com.wipro.ecoproductms.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.ecoproductms.dto.OrderDto;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductEventProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public ProductEventProducer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void publishStockUpdated(OrderDto order) {
        try {
            String eventJson = objectMapper.writeValueAsString(order);
            kafkaTemplate.send("producttoorder", eventJson);
            System.out.println(" [ProductMS] Published stock update to topic 'producttoorder': " + eventJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
