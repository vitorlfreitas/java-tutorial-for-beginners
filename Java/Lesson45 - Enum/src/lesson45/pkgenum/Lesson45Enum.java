package lesson45.pkgenum;

/**
 * Enumeration is a set of named constants that we can use throughout   * our program.
 * 
 * @author vitor
 */
public class Lesson45Enum {
    
    public static void main(String[] args) {
        
        // Enum cannot be instancied
        // MonthsOfYear month = new MonthsOfYear(); Erro
        
        // You can use as a Data type
        MonthsOfYear first = MonthsOfYear.JAN;
        System.out.println(first); // Output: JAN
        
        // Useful when you do not know the name of the enum const 
        MonthsOfYear second = MonthsOfYear.valueOf("FEB");
        System.out.println(second);

        // Using for and a built-in method
        for (MonthsOfYear months : MonthsOfYear.values())  {
            System.out.println(months);
        }        
        
        // If Statements
        if (first == MonthsOfYear.JAN) {
            System.out.println("We are in the first month of the year");
        }
        // Using the method
        System.out.println(MonthsOfYear.JUN.getNumberOfMonth());
        
        
        
    }
    
}
