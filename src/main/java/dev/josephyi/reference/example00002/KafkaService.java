package dev.josephyi.reference.example00002;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        logger.info("Sent message to topic: " + topic);
    }

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void consumeMessage(String message) {
        logger.info("Consumed message: " + message);
    }
}
