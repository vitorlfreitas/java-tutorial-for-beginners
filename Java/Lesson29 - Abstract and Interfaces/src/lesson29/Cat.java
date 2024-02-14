package lesson29;

public class Cat extends Animal implements LivingBeing {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
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
    
    
    
}
