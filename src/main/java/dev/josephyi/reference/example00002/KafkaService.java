package dev.josephyi.reference.example00002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("Sent message to topic: " + topic);
    }

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
