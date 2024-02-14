/* Methods in Java */

package lesson23;

import java.util.Scanner;

public class Lesson23 {
    
    // This is a method, in other languages it is called "Funtion"
    
    /* 
    -> public = You can access this method wherever you are
    -> static = It's a method that belongs to the class
    -> byte = it is the return keyword, it means that the return must return byte
    -> menuOption = the name of our method
    -> () it is where we assign if our method will have paramets or not */
    
    public static byte menuOption() {
        
        byte option;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Enter the number of your option:");
            System.out.println("1) Yes 2) No ");
            System.out.print("Option: ");
            option = scan.nextByte();
        } while (option < 1 || option > 2);
        
        
        return option;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        byte option;
        
        System.out.println("---- Welcome to our form ----");
        System.out.println("Would you like to enter on our website?");
        option = menuOption(); // We call the method here
        
        if (option == 1) 
            System.out.println("Welcome!");
        else
            System.out.println("See you!");
    }
    
}