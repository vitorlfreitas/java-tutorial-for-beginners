package lesson35;

import java.util.List;

public class Department {
    
    private String name;
    private List<Staff> staff;

    public Department(String name, List<Staff> staff) {
        this.name = name;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
    
    
}
