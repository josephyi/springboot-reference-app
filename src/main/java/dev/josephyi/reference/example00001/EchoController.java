package dev.josephyi.reference.example00001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class EchoController {
    
    private static final Logger logger = LoggerFactory.getLogger(EchoController.class);

    @GetMapping("/echo")
    public RequestRecord echo(HttpServletRequest request) {
        logger.info("/echo");
        return new RequestRecord(request.getMethod());
    } 
}
