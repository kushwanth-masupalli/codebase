package com.kushwanth.demo.Repository;

import com.kushwanth.demo.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    List<Doctor> findByDepartment(String department);
}

