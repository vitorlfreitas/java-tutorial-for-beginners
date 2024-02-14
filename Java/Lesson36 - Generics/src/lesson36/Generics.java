package lesson36;

/* Generics in Java allows us to not define which type is required. So we can reuse 
the same class, interface, or wharever with differents types */
import java.time.Instant;
import java.util.Date;

public class Generics {
    
    public static void main(String[] args) {
        
        // Using the Generic Class to create an object of the data type Int
        GenericClass<Integer> generic = new GenericClass(Date.from(Instant.now()));
        System.out.println(generic.getData());
        
        // Using the Generic Class to create an object of the data type Double
        GenericClass<Double> price = new GenericClass(10.90);
        System.out.println(price.getData());
        
        // Using the Generic Class to create an object of the data type String
        GenericClass<String> text = new GenericClass("Hello, World!");
        System.out.println(text.getData());
        
    }
    
}
