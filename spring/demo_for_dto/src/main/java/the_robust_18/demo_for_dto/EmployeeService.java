package the_robust_18.demo_for_dto;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework. stereotype.Service;

@Service
public class EmployeeService {

    static List<Employee> list = new ArrayList<>();
    private static ModelMapper modelMapper = new ModelMapper();

    public EmployeeService() {
        list.add(new Employee(1, "lskd s afj", ": sldkfj", "lskdjfs", "lksdfjdlsk"));
        list.add(new Employee(3, "lskfsdfsdfj", ":slfdkfj", "lskd jfs", "lksdfjdlsk"));
        list.add(new Employee(23, "lskdfj", ":sldkfj", "lskdjfs", "lksdfjdlsk"));
        list.add(new Employee(2345, "lskas  sdfj", ": s  ldkfj", "lskdjfs", "lksdfjdlsk"));
        list.add(new Employee(3453, "lskdfs j", ":sldk  fj", "lskdjfs", "lksdfjdlsk"));
    }

    public static EmployeeDTO getEmployeeById(int empid) {
        for (Employee e : list) {
            if (e.getEmpid() == empid) {
                return modelMapper.map(e, EmployeeDTO.class);
            }
        }
        return null;
    }
}