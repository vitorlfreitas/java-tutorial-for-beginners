/* Continue and Break */

package lesson22;

import java.util.Scanner;

public class Lesson22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("---- Welcome to our form ----\n Type \"Restart\" to Restart your form, or \"Exit\" to Exit");
        while (true) {
            System.out.print("Name: ");
            input = scan.next();
            if (input.toLowerCase().equals("restart"))
                continue;
            if (input.toLowerCase().equals("exit"))
                break;
            System.out.println(input);
        }
    }
    
}
