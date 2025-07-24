package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greet() {
        return "Hello from Spring Boot! Current time: " + java.time.LocalDateTime.now();
    }
    @GetMapping("/Welcome")
    public String greetwelcome() {
        return "Hello from Welcome page! Current time: " + java.time.LocalDateTime.now();
    }
}
