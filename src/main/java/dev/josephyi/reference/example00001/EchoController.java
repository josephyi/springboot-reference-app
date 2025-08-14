package dev.josephyi.reference.example00001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class EchoController {
    
    @GetMapping("/echo")
    public RequestRecord echo(HttpServletRequest request) {
        return new RequestRecord(request.getMethod());
    } 
}
