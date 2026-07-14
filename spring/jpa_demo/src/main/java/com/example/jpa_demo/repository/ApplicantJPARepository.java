package com.example.jpa_demo.repository;

import com.example.jpa_demo.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApplicantJPARepository extends JpaRepository<Applicant,Long> {

    //List<Applicant> getApplicantByStatusOrderByNameAsc(String status); if you want it by sorting

    List<Applicant> getApplicantByStatus(String status);


    @Query("SELECT a FROM Applicant a  WHERE a.name LIKE %:name%")
    List<Applicant> getApplicantByPartialName(@Param("name") String name);
}
