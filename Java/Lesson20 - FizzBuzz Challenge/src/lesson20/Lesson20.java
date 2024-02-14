/* FizzBuzz Challenge */

// If you have never heard about FizzBuzz, search on the youtube

package lesson20;

import java.util.Scanner;

public class Lesson20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Number: ");
        byte number = scan.nextByte();
        
        if (number % 3 == 0 && number % 5 == 0 ) 
            System.out.println("FizzBuzz");
        else if (number % 3 == 0 && number % 5 != 0 )
            System.out.println("Buzz");
        else if (number % 3 != 0 && number % 5 == 0 )
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
    
}
