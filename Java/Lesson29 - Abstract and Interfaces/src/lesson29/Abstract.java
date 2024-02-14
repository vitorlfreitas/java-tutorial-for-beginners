// Abstract Class can not be instancied
package lesson29;

public class Abstract {

    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Mel", 1);
        cat1.makeNoise();
        
        Dog dog1 = new Dog("Rex", 2);
        
        dog1.makeNoise();
        
        dog1.beFriendly();
    }
    
}
