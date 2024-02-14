package lesson40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    The Set interface extends the Collection interface. A collection represents a group of objects, called as "elements".
    With a Set, you have all its methods 
*/

public class SetsAndHashSet {

    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();
        
        // Adding an element
        names.add("Adam");
        names.add("Deniz");
        names.add("Vitor");
        names.add("Bruna");
        names.add("Bruna");
        names.add("Mike");
        
        System.out.println(names);
        // [Adam, Mike, Deniz, Vitor, Bruna]
        
        /* 
            Notice that we tried to add Bruna twice, but only one was implemented. Set do not allow duplicated elements
            Notice also that the ordem of the elements has changed. That's because a Set do not sort the elements
        */ 
        
        // Removing an element
        names.remove("Mike");
        // You can only remove an element using an object as a parameter, because, HashSet do not maintain an order, there is not index
        
        // Checking the Size
        System.out.println(names.size()); 
        
        // Checking if it is empty
        System.out.println(names.isEmpty()); 
        
        // forEach()
        names.forEach(System.out::println);
                
        /* Removing ALL elements. Be careful
        names.clear();
        System.out.println(names); */
        
        // *** How to easily remove all duplicated elements from an array ***
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 1));
        System.out.println(numberList); // [1, 2, 3, 4, 3, 1]
        // Notice that there are duplicated numbers
        
        Set<Integer> numberSet = new HashSet<>(numberList);
        
        System.out.println(numberSet); // [1, 2, 3, 4]
        
        
    }
    
}
