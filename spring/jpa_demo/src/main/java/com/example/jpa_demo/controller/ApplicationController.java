package com.example.jpa_demo.controller;

import com.example.jpa_demo.entity.Application;
import com.example.jpa_demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;


    @PostMapping("/{applicantId}")
    public ResponseEntity<Application>  createApplication(@PathVariable Long applicantId, @RequestBody Application application){

        return ResponseEntity.ok(applicationService.createApplication(applicantId,application));
    }


}
