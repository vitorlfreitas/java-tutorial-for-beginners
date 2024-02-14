/* Loops */

package lesson21;

import java.util.Scanner;

public class Lesson21 {

    public static void main(String[] args) {
        
        // For Loops
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }
        
        // While loops, very useful when we do not know how many times our code will be executed, for example
        
        Scanner scan = new Scanner(System.in);
        String input = "";
        
        while(!input.equals("quit")) {
            System.out.print("Input: ");
            input = scan.next();
            System.out.println(input);
            input = input.toLowerCase();
        }
        
        // Do.. While is used when we want to run our code at least 1 time
        do {
            System.out.print("Input: ");
            input = scan.next();
            System.out.println(input);
            input = input.toLowerCase();
        } while(!input.equals("quit"));
        
    }
    
}
