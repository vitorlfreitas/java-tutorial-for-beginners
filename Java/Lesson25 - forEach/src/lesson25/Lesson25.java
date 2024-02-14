/* forEach Loop 
    Watch this video => https://www.youtube.com/watch?v=t8mmNbgKA8w */
package lesson25;

public class Lesson25 {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Passion Fruit"};
        
        // Using the classic for loop
        for (byte i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        // Using forEach
        for (String fruit : fruits)
            System.out.println(fruit);
    }
    
}
