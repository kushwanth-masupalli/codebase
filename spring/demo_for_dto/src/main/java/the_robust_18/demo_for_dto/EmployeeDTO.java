package the_robust_18.demo_for_dto;

public class EmployeeDTO {
    private long empid;
    private String name;
    private String email;
    private String role;

    public EmployeeDTO() {
    }

    public EmployeeDTO(long empid, String name, String email, String role) {
        this.empid = empid;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters and Setters
    public long getEmpid() { return empid; }
    public void setEmpid(long empid) { this.empid = empid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}