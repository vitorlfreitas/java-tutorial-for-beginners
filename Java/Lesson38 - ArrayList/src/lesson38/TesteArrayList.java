package lesson38;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteArrayList {
    
    /* *** Array vs ArrayList ***
    
        ** Arrays:
            * Arrays have fixed sizes
            * Array can hold primitives and objects
        ** ArrayList:
            * ArrayList can only hold objects, but supports WRAPPER
            types for primitives
            * ArrayList adjust its size automatically
    */

    public static void main(String[] args) {
        
        // Creating an Array
        String[] array = {"Vitor", "Teddy", "Fabiane"};
        
        // Creating an ArrayList
        ArrayList<String> arrayList = 
                new ArrayList<>(Arrays.asList(
                        "Vitor", "Teddy", "Fabiane"));
        
        // * Getting an element
        System.out.println(array[0]);
        
        System.out.println(arrayList.get(0));
        
        // * Getting the size of our Array
        System.out.println(array.length); // Field
        System.out.println(arrayList.size()); // Method Call
        
        // * Adding an element
        // You can't do that with Arrays :(
        arrayList.add("John");
        
        // * Setting an element
        array[2] = "Light";
        arrayList.set(2, "Light");
        
        // * Removing an element
        // You can't remove an element from an Array :(
        arrayList.remove(3); // Using index
        arrayList.remove("Light"); // Using the object
        
        // * Printing
        System.out.println(array); // Strange Output, because it is the address memory reference.
        // I suppose you are not looking for the memory address, are you??
        
        System.out.println(arrayList); // [Vitor, Teddy]
        
        
        
        // As ArrayList implements java Collection, it inherits a lof of USEFUL methods, such as:
        System.out.println(arrayList.isEmpty()); 
        // Returns a boolean
        
        System.out.println(arrayList.contains("Teddy"));
        // It checks the elements in an array and returns a boolean
        
        System.out.println(arrayList.indexOf("John"));
        // Returns the index of the element, or -1 if not found
        
        // and others...
        
        
    }
    
}
