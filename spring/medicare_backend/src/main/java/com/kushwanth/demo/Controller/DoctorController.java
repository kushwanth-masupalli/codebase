package com.kushwanth.demo.Controller;

import com.kushwanth.demo.Serivce.DoctorService;
import com.kushwanth.demo.model.Doctor;
import com.kushwanth.demo.utility.Slot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {


    @Autowired
    DoctorService doctorService ;

    @GetMapping("/allDoctors")
    public List<Doctor>  getAllDoctors(){
       return  doctorService.getAllDoctors();
    }

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor d){
        return doctorService.addDoctor(d);
    }


    @GetMapping("/getDoctor/{id}")
    public Doctor getSlotById(@PathVariable String id ){
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/getAllDept")
    public List<String> getAllDepartments(){
        return doctorService.getAllDepartments();
    }

    @GetMapping("/getDocByDept/{name}")
    public List<Doctor> getDoctorsByDepartment(@PathVariable String name){
        return doctorService.getDoctorByDepartment(name);
    }


}
