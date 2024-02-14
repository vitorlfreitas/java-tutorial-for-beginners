/* ---- Math Class ---- */

// A useful built-in library for us

package lesson12;

public class Lesson12 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        double num = 2.4;
        // Math.round rounds to the nearest integer
        int res = (int) Math.round(num);
        System.out.println(res); // Outcome 2
        
        double num2 = 2.4;
        //  Math.ceil always rounds up to the next integer
        int res2 = (int) Math.ceil(num2);
        System.out.println(res2); // Outcome 3
        
        double num3 = 2.6;
        // Math.round always rounds down to the next integer
        int res3 = (int) Math.floor(num3);
        System.out.println(res3); // Outcome 2,
        
        // Max e Min
        int maxNum = Math.max(2, 4);
        System.out.println(maxNum);
        
        // Random Numbers
        int randomNumber = (int) Math.round(Math.random() * 100);
        int randomNum = (int) (Math.random() * 100);
        
        System.out.println(randomNumber);
        System.out.println(randomNum);
                
    }
    
}
