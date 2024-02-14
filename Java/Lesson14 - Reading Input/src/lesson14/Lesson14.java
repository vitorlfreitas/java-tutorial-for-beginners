// Reading Inputs

package lesson14;

import java.util.Scanner;

public class Lesson14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        // Variable
        boolean opt = false;
        
        System.out.print("Enter your Name: ");
        String name = scan.nextLine().trim();
        
        System.out.print("Enter your Age: ");
        byte age = scan.nextByte();
        
        System.out.print("What is your job: ");
        String job = scan2.nextLine().trim();
        
        System.out.println("Do you have child: ");
        System.out.println("1- Yes | 2- No");
        System.out.print("Enter the Number: ");
        byte opt1 = scan.nextByte();
        if (opt1 == 1) {
            opt = true;
        }
        // Outcome
        System.out.println("-------------------");
        System.out.println("Welcome " + name);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Profesion: " + job);
        System.out.println("Child: " + opt);
        System.out.println("-------------------");
        
    }
// Explaining:
// nextLine() caputures the whole output, even if there is white space in it.
// Trim() is a String Class method, and very useful. It is used to format strings, it removes all the white space before and after a string data. 
    
}
