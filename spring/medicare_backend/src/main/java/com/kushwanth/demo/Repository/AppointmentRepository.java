package com.kushwanth.demo.Repository;


import com.kushwanth.demo.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {

    List<Appointment> findByDoctor(String id);
}

