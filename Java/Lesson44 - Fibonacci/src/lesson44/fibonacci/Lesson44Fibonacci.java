package lesson44.fibonacci;

public class Lesson44Fibonacci {

    public static void main(String[] args) {
        
        System.out.println(fibonacciNumber(5));
    }
    
    public static int fibonacciNumber(int n) {
        
        if (n < 0) {
            return -1;
        }
        else if (n == 0)
            return 0;
        else if (n == 1) 
            return 1;
        else {
            
            int previousFib = 0;
            int currentFib = 1;

            
            for (int i = 2; i < n; i++) {
                int nextFib = currentFib + previousFib;
                
                previousFib = currentFib;
                currentFib = nextFib;
            }
            
            return currentFib;
        }            
            
    }
}
    
