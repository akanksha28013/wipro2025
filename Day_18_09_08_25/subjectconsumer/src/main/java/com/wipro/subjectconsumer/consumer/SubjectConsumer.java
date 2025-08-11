package com.wipro.subjectconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.subjectconsumer.dto.Subject;

@Component
public class SubjectConsumer{
	@KafkaListener(topics = "learn-subject", groupId = "group_id")
    public void consume(Subject msg) {
        System.out.println("Consumed message: " + msg);
    }
}