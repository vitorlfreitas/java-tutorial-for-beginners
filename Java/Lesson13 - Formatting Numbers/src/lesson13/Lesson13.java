/* Formatting Numbers */ 

package lesson13;

// Importing a java library
import java.text.NumberFormat;

public class Lesson13 {

    public static void main(String[] args) {
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res = currency.format(123456.891);
        System.out.println(res);
        // Outcome: R$ 123.456,89
        
        NumberFormat percent = NumberFormat.getPercentInstance();
        String res2 = percent.format(0.2);
        System.out.println(res2);
        // Outcome: 20%
        
        // Short way to write this code
        String res3 = NumberFormat.getPercentInstance().format(0.248);
        System.out.println(res3);
        // Outcome: 25%
    }
    
}
