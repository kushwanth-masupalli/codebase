package com.example.jpa_demo.service;


import com.example.jpa_demo.entity.Applicant;
import com.example.jpa_demo.entity.Application;
import com.example.jpa_demo.repository.ApplicantJPARepository;
import com.example.jpa_demo.repository.ApplicationRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    ApplicantJPARepository applicantJPARepository;


    @Autowired
    ApplicationRepository applicationRepository;

    public Application createApplication(Long applicantId,Application application) {
            Applicant applicant = applicantJPARepository.getReferenceById(applicantId);
            application.setApplicant(applicant);
           return applicationRepository.save(application);
    }
}
