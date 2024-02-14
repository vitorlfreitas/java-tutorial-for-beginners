package lesson02;
// Types
public class Lesson02 {

    public static void main(String[] args) {
        /* ------- Types of Data ---------
        We always need to be precise when we have to decide 
        which data type to use, it has a direct impact on the memory use
        of our application */
        
        // Some Example
        
        // We dont need more than a byte for a human's age
        byte myAge = 30;
        // Sometimes, I book has more than 127 years
        short bookAge = 150;
        // For numbers between -2B and 2B, Use int
        int housePrice = 150_000_000;
        // For longer numbers, use long with a L in the end
        long ElonMuskWealth = 3_000_000_000L;
        
        // For numbers till 4 bytes
        float price = 10.99F;
        // For long and huge numbers, till 8 bytes
        double highPrice = 100_000.50;
        
        // One character
        char letter = 'A';
        // Strings
        String word = "Hello, my friend";
        
        // Boolean
        boolean isTall = false;
               
        System.out.println(myAge);
        // Output: 30
        System.out.println(bookAge);
        // Output: 150
        System.out.println(housePrice);
        // Output: 150000000
        System.out.println(ElonMuskWealth);
        // Output: 3000000000 -- No 'L'
        System.out.println(price);
        // Output: 10.99
        System.out.println(highPrice);
        // Output: 100000.5
        System.out.println(letter);
        // Output: A
        System.out.println(word);
        // Output: Hello, my friend
        System.out.println(isTall);
        // Output: false
    }
    
}
