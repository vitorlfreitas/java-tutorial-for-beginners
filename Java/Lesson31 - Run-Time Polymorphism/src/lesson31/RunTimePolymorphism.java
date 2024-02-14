package lesson31;

/* Runtime polymorphism is a concept that allows a subclass to provide a 
    specific implementation of a method that is already defined in its superclass. 
    When a subclass provides its own implementation of a method that is already
    present in its superclass, it is said to override that method */

public class RunTimePolymorphism {

    public static void main(String[] args) {
        
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        
        cat.speak(); // Meow Meow
        dog.speak(); // Bark Bark
        bird.speak(); // Chirp Chirp
    }
    
}
