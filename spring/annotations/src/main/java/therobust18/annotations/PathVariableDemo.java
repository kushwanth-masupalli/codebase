package therobust18.annotations;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableDemo {


    @GetMapping("/api/{id}")
    public String m1(@PathVariable int id){
        return "lkdfjs id is dk "+id;
    }

}
