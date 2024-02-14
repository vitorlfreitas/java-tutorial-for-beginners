/* Matrix */

// If you don't know what is a Matrix, watch some videos on youtube :)

package lesson08;

import java.util.Arrays;

public class Lesson08 {

    public static void main(String[] args) {
        // Old WAY
        int[][] num = new int[2][3];
        
        num[0][0] = 1;
        num[0][1] = 5;
        
        System.out.println(Arrays.deepToString(num));
        
        // New WAY
        int[][] num2 = { {1, 2}, {3, 4, 5} };
        System.out.println(Arrays.deepToString(num2));
    }
    
}
