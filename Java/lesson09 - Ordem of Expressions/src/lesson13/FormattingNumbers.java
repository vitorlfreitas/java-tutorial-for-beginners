package lesson13;

public class FormattingNumbers {

    public static void main(String[] args) {
        
        int res = 10 / 3;
        
        System.out.println(res); // Outcome = 3
        
        double res2 = (double)10 / (double)3;
        
        System.out.println(res2); // Outcome: 3.3333333
        
        int x = 1;
        x++; // Incrementor Operator ++, it adds 1 to the value
        System.out.println(x); // 2
        
        // Pay attention on ORDEM of the expression
        int a = 1;
        int b = a++;
        // Outcome: a = 2, b = 1
        
        int c = 1;
        int d = ++c;
        // Outcome: c = 2, d = 2
        
        /* 
        If the increment operator (++n) comes before  the varible, it adds 1 to the value and then adds the value to the variable
        However, if the incrementor comes after (n++), so first it adds the initial value to the variable we are declaring, and then adds 1 to the variable. 
        */
        
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
        //       Output: a: 2 b: 1 c: 2 d: 2

        // In Java, there is the decrement operator as well, that works similarily to the increment.
        // See? Nothing to worry about
   }
    
}
