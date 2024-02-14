// Project: Mortgage Calculator (Simple)
package lesson15;

import java.util.Scanner;
import java.text.NumberFormat;

public class Lesson15 {

    public static void main(String[] args) {
        
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        Scanner scanner = new Scanner(System.in);
        // Scanner rate = new Scanner(System.in);
        // Scanner time = new Scanner(System.in);
        
        System.out.println("---- Mortgage Calculator ----");
        
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = (annualRate / PERCENT) / MONTHS_IN_YEAR;
        
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        
        double mortgage = (principal * monthlyRate * (Math.pow((1 + monthlyRate), numberOfPayments))) / (Math.pow((1 + monthlyRate), numberOfPayments) - 1) ;
        
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        
        System.out.println("Mortage: " + mortgageFormatted);
    }
    
}
