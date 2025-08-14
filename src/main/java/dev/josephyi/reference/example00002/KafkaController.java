package dev.josephyi.reference.example00002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(
            @RequestParam String topic, 
            @RequestBody String message) {
        kafkaService.sendMessage(topic, message);
        return ResponseEntity.ok("Message sent to " + topic);
    }
}
