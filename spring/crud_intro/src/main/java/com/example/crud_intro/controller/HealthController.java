package com.example.crud_intro.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public ResponseEntity<?> getHealth(){
        return ResponseEntity.ok("""
                   { 
                      "message":"health if finel"
                   }
                """);
    }
}
