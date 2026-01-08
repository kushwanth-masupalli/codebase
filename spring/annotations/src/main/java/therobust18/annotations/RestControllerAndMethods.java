package therobust18.annotations;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class RestControllerAndMethods {

    @GetMapping("/e")
    public String m1(){
        return "dlksfj";
    }


    @PostMapping("/e")
    public String m3(){
        return "dlksfj";
    }


    @PutMapping("/e")
    public String m4(){
        return "dlksfj";
    }

    @DeleteMapping("/e")
    public String m23(){
        return "dlksfj";
    }
}
