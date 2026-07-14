package com.kushwanth.demo.Serivce;

import com.kushwanth.demo.Repository.AppointmentRepository;
import com.kushwanth.demo.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {


    @Autowired
    AppointmentRepository appointmentRepository;

    public List<Appointment> getAllUsers() {
       return appointmentRepository.findAll();
    }

    public List<Appointment> getAllUsersByDoctor(String id) {
        return appointmentRepository.findByDoctor(id);
    }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}
