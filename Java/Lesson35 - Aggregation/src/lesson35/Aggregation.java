package lesson35;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {

    public static void main(String[] args) {
        
        // Creating new Staffs
        Staff id115 = new Staff("Vitor", "Software Eng", "Mobile");
        Staff id9001 = new Staff("Marceka", "Marketing", "Games");
        Staff id1010 = new Staff("Person1", "Data Analyst", "Mobile");
        
        // Creating a List of Staff that work in the Mobile Department
        List<Staff> mobile = new ArrayList();
        mobile.add(id115);
        mobile.add(id1010);
        
        // Creating a List of Staff that work in the Games Department
        List<Staff> game = new ArrayList();
        game.add(id9001);
        
        // Creating the Departments of the Company
        Department departmentMobile = new Department("IOS Department", mobile);
        Department departmentGames = new Department("Games Development", game);
        
        // Creating a List of the Departments
        List<Department> departments = new ArrayList();
        departments.add(departmentMobile);
        departments.add(departmentGames);
        
        // Creating the Company
        Company companyABC = new Company("ABC", departments);
        
        // Displaying the number of staff that work for this Company
        System.out.println("Numbers of Staff: " + companyABC.getNumbersOfStaff());
        
        
        
        
    }
    
}
