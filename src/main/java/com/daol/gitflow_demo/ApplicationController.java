package com.daol.gitflow_demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    
    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Hello from Spring Boot!",
            "status", "ok"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}