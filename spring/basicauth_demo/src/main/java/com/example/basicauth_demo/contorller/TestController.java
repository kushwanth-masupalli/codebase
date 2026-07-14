package com.example.basicauth_demo.contorller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/public/hello")
    public String publicEndpoint() {
        return "Public API";
    }

    @GetMapping("/user/hello")
    public String userEndpoint() {
        return "User API";
    }

    @GetMapping("/admin/hello")
    public String adminEndpoint() {
        return "Admin API";
    }
}