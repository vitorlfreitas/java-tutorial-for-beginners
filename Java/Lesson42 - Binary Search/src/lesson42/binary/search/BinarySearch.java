package lesson42.binary.search;

import java.util.Arrays;

/*      **** What is Binary Search? ****
Binary Search is a search algorithm used to find the position of a target value within a SORTED array or list. It works by repeatedly dividing the search range in half, and if the target number is not found, it returns -1. However, if the number is found, it returns the target number index. If the arrat contains repetitive numbers, the search will find the index of any occurence of the target number. */

public class BinarySearch {

    public static void main(String[] args) {
        
        int[] ints = {1, 2, 4, 5, 7, 10, 14, 18, 19, 11, 15, 21};
        
        // Never forget to sort the Array
        Arrays.sort(ints);
        
        System.out.println(binarySearch(ints, 20));
        // Output: -1
        System.out.println(binarySearch(ints, 10));
        // Output: 5
        
        // We can also use a bult-in library that has the binarySearch method implemented
        System.out.println(Arrays.binarySearch(ints, 10));
        // Output: 5
        
        /*Important Note: The Arrays.binarySearch() assumes that the array is already sorted. If the array is not, the result is undefined. It may return incorrect results, and you cannot rely on its behavior*/
    }
    
    
    private static int binarySearch(int[] numbers, int target) {
        
        int low = 0, high = numbers.length - 1;
        
        while (low <= high) {
            
            int mid = (low + high) / 2;
            int midNumber = numbers[mid];
            
            if (target == midNumber) {
                return mid;
            }
            else if (target < midNumber) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
