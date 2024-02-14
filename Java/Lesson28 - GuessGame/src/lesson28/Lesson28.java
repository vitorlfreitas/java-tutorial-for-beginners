/* Try and Catch */

// Analyze this game
package lesson28;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Lesson28 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] primeNumber = {2, 3, 5, 7, 13, 17, 19, 19, 23, 29, 31, 37, 41, 
                            43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89};
        
        byte randomNumber = (byte) Math.round(Math.random() * 100);
        byte number = 0;
        byte attempts = 0;
        int remainingAttempts = 4;
        
        boolean isDivisibleByTwo = (randomNumber % 2) == 0;
        boolean isDivisibleByThree = (randomNumber % 3) == 0;
        boolean isDivisibleByFive = (randomNumber % 5) == 0;
        boolean isPrime = false;
        
        int squarePlusTen = (int) Math.pow(randomNumber, 2) + 10;
        
        for (int i = 0; i < primeNumber.length; i++) {
            if (randomNumber == primeNumber[i]) {
                isPrime = true;
            }
        }

        System.out.println("--- Welcome to the GuessGame! ---");
        System.out.println("You have 5 attempts to find the number");
        System.out.println("*** I will give you some HINTS ***");
        System.out.println("1- The number is between 1 and 100");
        
        if(isDivisibleByTwo) 
            System.out.println("2- The number is even (2, 4, 6...)");
        else
            System.out.println("2- The number is odd (1, 3, 5...)");
                
        if(isDivisibleByThree) 
            System.out.println("3- The number is divisible by 3");
        else
            System.out.println("3- The number is not divisible by 3)");
        
        if(isDivisibleByFive) 
            System.out.println("4- The number is divisible by 5");
        else
            System.out.println("4- The number is not divisible by 5)");
        if(isPrime) 
            System.out.println("5- The number is prime");
        else
            System.out.println("5- The number is not prime");
        
        System.out.println("6- The square of the Randon Number + 10 is " + squarePlusTen);
        
        while (attempts < 5) {
            
            System.out.print("Enter a number: ");
            try {
                number = scan.nextByte();

            } catch (InputMismatchException e) {
                System.out.println("Wrong input! \nPlease enter a valid number!");
                scan.next();
            }
            if (number == randomNumber) {                
                System.out.println("Congratulations! You guest with only " + ++attempts + " attempts");
                break;
            }
            
            else if (attempts < 3)  {               
                System.out.println("Wrong! You still have " + remainingAttempts + " attempts");
                remainingAttempts = remainingAttempts - 1;
            }
            
            else if (attempts == 3)
                System.out.println("You have only one more shot!");
            
            attempts++;
        }
        
        if (attempts == 5) {
            System.out.println("Game Over, You ran out of attempts, the number was " + randomNumber);
        }
    }
}

