package com.example.jpa_demo.repository;

import com.example.jpa_demo.entity.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepository extends CrudRepository<Applicant,Long> {
}
