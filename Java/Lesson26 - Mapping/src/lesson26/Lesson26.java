// Mapping in Java
package lesson26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson26 {
    
    public static int squareNumbers(int n) {
        return n * n;
    }
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Using map to square each element in the list
        
        List<Integer> squaredNumbers = numbers.stream() // Create a stream
                                              .map(n -> n * n) // Apply the method we create (n * n) to each element
                                              .sorted() // Sort the elemetns in their natural ordem
                                              .collect(Collectors.toList()); // Collects the result into a new List

                
        /* Mapping is a powerful tool, it allows us to use a method in EACH element of any arrays individually, in other words, we can manipulate the elements and do wharever we want to do
        ** Note: We can use external methods as a parameter for map() */
        
        /*
        Filter is a method that allows us to use a function to filters the elements within an array.
        In our case, the filter method only returns the number that the remainder is equal to 0
        */
        
        List<Integer> squaredEvenNumbers = numbers.stream()
                                        .filter(n -> n % 2 == 0) // Using the method Filter to remove the odd numbers
                                        .map(n -> squareNumbers(n)) // External function
                                        .collect(Collectors.toList());

        System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25, 36, 49, 64]
        System.out.println(squaredEvenNumbers); // Output: [4, 16, 36, 64]
        
    }
}
