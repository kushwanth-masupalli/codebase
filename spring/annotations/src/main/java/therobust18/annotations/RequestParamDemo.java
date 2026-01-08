package therobust18.annotations;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamDemo {

      @GetMapping("/rp")
      public String some(@RequestParam(name = "id") int empid) {
          return "the empid is "+empid;
      }
}
