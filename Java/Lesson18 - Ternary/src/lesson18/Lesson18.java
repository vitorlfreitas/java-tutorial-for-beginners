/* Ternary Operator */

package lesson18;

public class Lesson18 {

    public static void main(String[] args) {
        
        int income = 200_000;
        String className = (income >= 100_000) ? "Rich" : "Poor";
        System.out.println(className);
        
        /* The Ternary Operator is divided into 3 parts:
        
        -> Part 1: (income >= 100_000)
            is the boolean operation which returns either "true" or "false"

        -> Part 2: ? "Rich" 
            is the action we want that happen, if the operation returns true.

        -> Part 3: : "Poor" 
            is the action we want that happen, if the operation returns false.

        Structure:
            boleanOperation ? true : false;

        */
        
    }
    
}
