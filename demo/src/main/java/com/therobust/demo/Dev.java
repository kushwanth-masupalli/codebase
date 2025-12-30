package com.therobust.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")// field injection
    Computer comp;


    // construtor injection

//    public  Dev(Laptop laptop){
//        this.laptop = laptop;
//    }


    // setter method

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        System.out.println("building a new project");
        comp.compile();
    }





     @RequestMapping("/")
     public String greet(){
         return "hello world i am iron man";
     }

}
