package com.kushwanth.demo.Serivce;

import com.kushwanth.demo.Repository.DoctorRepository;
import com.kushwanth.demo.model.Doctor;
import com.kushwanth.demo.utility.Slot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(String id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    public void deleteDoctor(String id) {
        doctorRepository.deleteById(id);
    }

    public List<String> getAllDepartments() {
        List<String> depts = new ArrayList<>();
        HashSet<String> temp = new HashSet<>();
        List<Doctor> doctors  = doctorRepository.findAll();
        for(Doctor d : doctors){
            if(!temp.contains(d.getDepartment())) {
                depts.add(d.getDepartment());
                temp.add(d.getDepartment());
            }
        }
        return depts;
    }

    public List<Doctor> getDoctorByDepartment(String name) {
        return doctorRepository.findByDepartment(name);
    }
}