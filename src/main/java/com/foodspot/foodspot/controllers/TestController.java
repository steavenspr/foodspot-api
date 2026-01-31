package com.foodspot.foodspot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {
    
    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "OK");
        response.put("message", "L'API FoodSpot fonctionne ! 🎉");
        response.put("timestamp", LocalDateTime.now());
        return response;
    }
    
    @GetMapping("/health")
    public String health() {
        return "API is running!";
    }
}