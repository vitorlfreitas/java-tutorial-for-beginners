package lesson37;

import java.util.Scanner;
import java.util.Stack;

/*
    The Stack ordens the elements in a LIFO (Last-In-First-Out)
*/

public class TesteStack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String car, addMore = "Y";
        
        //Assign the Stack
        Stack<String> storkTruck = new Stack<>();
        
        // Adding car into the stack, we can add as many as we want to.
        while(!addMore.equals("N"))
        {
            System.out.println("Enter the Car: ");
            car = scan.nextLine();
            
            // Adding the car into the Stack storkTruck 
            storkTruck.push(car);
            
            System.out.println("Add more? Y/N");
            addMore = scan.nextLine().toUpperCase();
        }
        
        
        System.out.println("Take out the cars in a specific ordem:");
        while(!storkTruck.empty()) // While the stack is not empty
        {
            // Take out the last element of the Stack 
            car = storkTruck.pop();
            System.out.println(car);
        }
    }
    
}
                    
                  
