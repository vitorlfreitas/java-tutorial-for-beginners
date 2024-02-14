package lesson41;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        
        // TreeSet works almost similar to a HashSet, but the difference is that the elements are ordered in its natural order. For example, if its a String, it is ordered in alphabetic order. Take a look: 
        names.add("Adam");
        names.add("Deniz");
        names.add("Vitor");
        names.add("Bruna");
        names.add("Bruna");
        names.add("Mike");
        
        System.out.println(names); 
        
        // TreeSet is WAY SLOWER than HashSet, so only use TreeSet when you really care about the order.
        
        // There is the LinkedHashSet as well, that maintain the order you add the elements, and also is slower than a HashSet.
        
        Set<String> names2 = new LinkedHashSet<>();

        names2.add("Jessy");
        names2.add("John");
        names2.add("Vitor");
        names2.add("Mark");
        
        System.out.println(names2);
        
    }
}
