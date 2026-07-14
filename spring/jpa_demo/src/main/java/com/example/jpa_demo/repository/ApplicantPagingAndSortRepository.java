package com.example.jpa_demo.repository;

import com.example.jpa_demo.entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

// instead of this we can use ListPagingAndSortingRepository for returning the list of applicants instead of the iterable



public interface ApplicantPagingAndSortRepository  extends PagingAndSortingRepository<Applicant,Long> {
}
