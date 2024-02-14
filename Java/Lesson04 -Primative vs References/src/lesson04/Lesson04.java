/* ** Primitive Types vs References Types ** */

// For a better understanding
// What this video => https://www.youtube.com/watch?v=OmcFVHpb0v0 ***
package lesson04;

import java.awt.*;

public class Lesson04 {

    public static void main(String[] args) {
        
        // Primitive Types
        byte x = 1;
        byte y = x;
        
        x = 2;
        
        System.out.println(y); // Out: 1
        
        // References Types
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        
        point1.x = 2;
        
        System.out.println(point2); // Out: [x=2,y=1]
    }
    
}
