/* Arrays */

package lesson07;

import java.util.Arrays;

public class Lesson07 {

    public static void main(String[] args) {
        // Old method
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        
        // New and Easiest Way
        int[] numbers2 = { 2, 3, 4, 10, 50, 60, 55, 7};
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers[1]);
        
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        
        
    }
    
}
