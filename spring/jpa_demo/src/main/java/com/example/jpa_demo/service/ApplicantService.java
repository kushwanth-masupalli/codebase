package com.example.jpa_demo.service;


import com.example.jpa_demo.entity.Applicant;
import com.example.jpa_demo.entity.Resume;
import com.example.jpa_demo.repository.ApplicantJPARepository;
import com.example.jpa_demo.repository.ApplicantPagingAndSortRepository;
import com.example.jpa_demo.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    ApplicantPagingAndSortRepository applicantPagingAndSortRepository;

    @Autowired
    ApplicantJPARepository applicantJPARepository;

    public List<Applicant> getAllApplicants() {
       return (List<Applicant>) applicantRepository.findAll();
    }

    public Applicant addApplicant(Applicant applicant) {
        Resume resume = applicant.getResume();
        resume.setApplicant(applicant);
        return applicantRepository.save(applicant);
    }


        public List<Applicant> getApplicantsWithPagination(int page,int size){
            return applicantPagingAndSortRepository
                    .findAll(PageRequest.of(page,size))
                    .getContent();
        }

    public List<Applicant> getAllApplicantByStatus(String name) {
       return  applicantJPARepository.getApplicantByStatus(name);
    }



    public List<Applicant> getAllApplicantByPartialName(String name) {
        return applicantJPARepository.getApplicantByPartialName(name);
    }
}
