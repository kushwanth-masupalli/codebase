package com.example.jpa_demo.repository;

import com.example.jpa_demo.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {
}
