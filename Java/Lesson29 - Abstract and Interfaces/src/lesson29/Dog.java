package lesson29;

// This class is implementing 2 interfaces and extending 1 class
public class Dog extends Animal implements LivingBeing, Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        
        System.out.println("Bark Bark");
    }

    @Override
    public void sleep() {
        System.out.println("ZzZzZ");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void beFriendly() {
        System.out.println(name + " is being friendly");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }
    
}
