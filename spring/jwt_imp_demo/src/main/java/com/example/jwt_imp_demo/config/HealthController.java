package com.example.jwt_imp_demo.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping("/health")
    public String health(){
      return "the server is up and running";
  }

}
