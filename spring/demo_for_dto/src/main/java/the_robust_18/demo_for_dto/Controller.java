package the_robust_18.demo_for_dto;

import org.springframework.web.bind.annotation.GetMapping;
import org. springframework.web.bind.annotation. PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework. web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

    @GetMapping("/{empid}")
    public EmployeeDTO getUser(@PathVariable int empid) {
        return EmployeeService.getEmployeeById(empid);  // ✅ Updated to EmployeeService
    }
}