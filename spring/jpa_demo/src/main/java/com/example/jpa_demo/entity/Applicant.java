package com.example.jpa_demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private  String name ;

    private  String email;

    private String phone;

    private String status;

    @OneToMany(mappedBy = "applicant",cascade = CascadeType.ALL)
    private List<Application> applicationsList = new ArrayList<>();



    public List<Application> getApplicationsList() {
        return applicationsList;
    }

    @OneToOne(mappedBy = "applicant",cascade =  CascadeType.ALL)
    private Resume resume;

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
