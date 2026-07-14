package com.example.jpa_demo.controller;


import com.example.jpa_demo.entity.Resume;
import com.example.jpa_demo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResumeController {

    @Autowired
    ResumeService resumeService;


    @PostMapping("/{applicantId}/addResume")
    public ResponseEntity<?> addResume(@PathVariable Long applicantId, @RequestBody Resume resume){
        Resume resume1 =   resumeService.addResume(applicantId,resume);
       return ResponseEntity.ok(resume1);
    }




}
