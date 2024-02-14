// Casting
package lesson14;

public class Lesson14 {

    public static void main(String[] args) {
        /* ---- Implicit Casting ----
        Order: byte > short > int > long > float > double
        Basically, implicit casting happens when there is no risk           of losing data */
        int x = 1;
        double y = x + 2.5;
        
        System.out.println(y); // Outcome: 3.5
        
        /* ------ Explicit Casting ------ 
        Bear in mind that, if you are converting a larger data into a smaller one, you may lose data or precisions. For example: */
        double a = 2.2;
        int b = (int) a;
        double c = 2.8;
        int d = (int) c;
        
        System.out.println(b); // Outcome: 2
        System.out.println(d); // Outcome: 2 Although the number was closer to 3 than 2, it has converted to 2.
        
        /* How to convert Strings to Integer */
        String num = "15";
        String num2 = "1.5";
        
        // For Integer Data
        int intRes = Integer.parseInt(num) * 2;
        // For Double Data
        double doubleRes = Double.parseDouble(num2) + 2;
        
        System.out.println(intRes);
        System.out.println(doubleRes);
        
    }
    
}
