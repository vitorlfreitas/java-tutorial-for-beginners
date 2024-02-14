package lesson39;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {

    /*
        * Queue = FIFO Data Structure | First-In First-Out

        * LinkedList is a class that extends Queue Interface, which
        extends Collection class. Therefore, LinkedList inherits their all methods and attributes.
    */
    public static void main(String[] args) {
        
        Queue<String> list = new LinkedList<>();
        
        // Add an element
        list.offer("Vitor");
        list.offer("Marcela");
        list.offer("Joao");
        
        // Get the first element
        System.out.println(list.peek()); // Vitor
        
        //Remove the first element of queue
        list.poll();
        System.out.println(list); // [Marcela, Joao]
        
        // Return true if the queue is empty
        System.out.println(list.isEmpty()); // false
        
        // Return the size in int type
        System.out.println(list.size()); // 3
        
        // Returns true if the queue constains the object
        System.out.println(list.contains("Larissa")); // false
                
    }
    
}
