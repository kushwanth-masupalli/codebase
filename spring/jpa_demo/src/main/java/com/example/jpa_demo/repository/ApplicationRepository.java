package com.example.jpa_demo.repository;

import com.example.jpa_demo.entity.Applicant;
import com.example.jpa_demo.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
