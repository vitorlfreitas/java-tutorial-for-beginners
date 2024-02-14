package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/* Recursion refers to a technique where a method calls itself to solve a smaller instance of the same problem */

public class Recursion {

    public static void main(String[] args) {
        
        int[] ints = {1, 2, 4, 5, 61, 51, 52, 101};
        int target = 61;
        
        // Important to Sort the array before calling the method
        Arrays.sort(ints);
        
        System.out.println(binarySearchRecursionly(ints, target, 0, ints.length - 1)); // Output: 6
        
        System.out.println(ints[6]); // Output: 61
        
    }
    
    public static int binarySearchRecursionly(int[] arr, int target, int low, int high) {
                
        if (low <= high) {
            
            int middle = (low + high) / 2;
            int middleNumber = arr[middle];
            
            if (target == middleNumber)
                return middle;
            else if (target < middleNumber)
                return binarySearchRecursionly(arr, target, low, middle - 1);
            else
                return binarySearchRecursionly(arr, target, middle + 1, high);
        }
        return -1;
    }
}
