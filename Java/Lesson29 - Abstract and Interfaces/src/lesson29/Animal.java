package lesson29;

    /*              *** Notes *** 
    Abstract class is a class that cannot be instantiated on its own and may 
    contain one or more abstract methods. It serves as a blueprint for other 
    classes and can contain both concrete (implemented) methods and 
    abstract (unimplemented) methods */

public abstract class Animal {
    
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /* Abstract method, which means that any class that instanciates this class
    has to implement its own method */
    
    public abstract void makeNoise();   
}
