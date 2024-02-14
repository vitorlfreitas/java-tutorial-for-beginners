package lesson35;

import java.util.List;

public class Company {
    
    private String name;
    private List<Department> departments;

    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public int getNumbersOfStaff() {
        
        int staffNumber = 0;
        List<Staff> staff;
        
        for (Department department : departments) {
            // Get the quantity of the staff in each department. 
            staff = department.getStaff();
            
            for (Staff s : staff) {
                staffNumber++;
            }
        }
        /* 
            Its a for...in in Java,
            There are two for...in in this example
            To make it simple, it will start checking the first department, 
            and then, the other loop starts and checks how many students there 
            are within the department list. When there is anymore students, 
            so the loop finishes and go for the second department. This process
            continues until there is anymore departments to be checked.
        
        */
        return staffNumber;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
    
    
    
}
