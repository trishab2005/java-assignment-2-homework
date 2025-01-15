
//@author: Trisha Basak

public class Employee {
    private String ename;
    private String designation;
    private double salary;
    private String email;

    // Getter and Setter for ename
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    // Getter and Setter for designation
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // printing employee details
    public String getEmployeeDetails() {
        
        String formattedSalary = (salary / 1000) + "k";
        return ename + " works as " + designation + " with email id " + email + " and earns " + formattedSalary + " per annum.";
    }

    public static void main(String[] args) {
    
        Employee employee = new Employee();
        
        // Set employee details
        employee.setEname("Ankan");
        employee.setDesignation("Developer");
        employee.setSalary(5000); 
        employee.setEmail("ank@ibm.com");

        // Print employee details
        System.out.println(employee.getEmployeeDetails());
    }
}