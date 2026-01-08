package therobust18.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyDemo {

    @PostMapping("/api/e1")
    public  String m1(@RequestBody Employee e){
       return e.toString();
   }
}
