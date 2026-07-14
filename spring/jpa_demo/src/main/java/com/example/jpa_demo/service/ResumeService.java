package com.example.jpa_demo.service;


import com.example.jpa_demo.entity.Applicant;
import com.example.jpa_demo.entity.Resume;
import com.example.jpa_demo.repository.ApplicantJPARepository;
import com.example.jpa_demo.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    ResumeRepository resumeRepository;


    @Autowired
    ApplicantJPARepository applicantJPARepository;

    public Resume addResume(Long applicantId, Resume resume) {

        Optional<Applicant> applicantOptional =applicantJPARepository.findById(applicantId);
        if(applicantOptional.isPresent()){
            Applicant applicant = applicantOptional.get();
            resume.setApplicant(applicant);
            return resumeRepository.save(resume);
        }
        else{
            throw new RuntimeException();
        }
    }
}
