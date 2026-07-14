package com.example.jpa_demo.controller;


import com.example.jpa_demo.entity.Applicant;
import com.example.jpa_demo.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicantController {


    @Autowired
    ApplicantService applicantService ;


    @GetMapping("/applicants")
    public ResponseEntity<?> getAllApplicants(){
        List<Applicant> applicants = applicantService.getAllApplicants();
        return ResponseEntity.ok(applicants);
    }

    @PostMapping("/addApplicant")
    public ResponseEntity<?> addApplicant(@RequestBody Applicant applicant){
        Applicant applicant1 = applicantService.addApplicant(applicant);
        return ResponseEntity.ok(applicant1);
    }

    @GetMapping("/getApplicantByPaging")
    public ResponseEntity<?> getApplicantsByPaging(@RequestParam  int page,@RequestParam int size){
       List<Applicant> applicants =  applicantService.getApplicantsWithPagination(page,size);
       return ResponseEntity.ok(applicants);
    }


    @GetMapping("/applicantsByStatus/{status}")
    public ResponseEntity<?> getAllApplicants(@PathVariable String status){
        List<Applicant> applicants = applicantService.getAllApplicantByStatus(status);
        return ResponseEntity.ok(applicants);
    }


    @GetMapping("/applicantsByPartialName/{name}")
    public ResponseEntity<?> getAllApplicantsByPartialName(@PathVariable String name){
        List<Applicant> applicants = applicantService.getAllApplicantByPartialName(name);
        return ResponseEntity.ok(applicants);
    }



}
