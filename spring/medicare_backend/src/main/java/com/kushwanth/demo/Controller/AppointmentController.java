package com.kushwanth.demo.Controller;


import com.kushwanth.demo.Serivce.AppointmentService;
import com.kushwanth.demo.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

   @Autowired
    AppointmentService appointmentService;

    @GetMapping("/users")
    public List<Appointment> getAllUsers(){
        return appointmentService.getAllUsers();
    }

    @GetMapping("/usersByDoctorId/{id}")
    public List<Appointment> getAllUsersByDoctor(@PathVariable String id){
        return appointmentService.getAllUsersByDoctor(id);
    }

    @PostMapping("/newApp")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentService.createAppointment(appointment);
    }



}
