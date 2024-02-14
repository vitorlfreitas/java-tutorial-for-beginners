package lesson29;

    /*              **** Notes ****
    Similar to abstract classes, Interfaces is also a blueprint of a class. 
    It defines a set of abstract methods 
    and constants that a class must implement. It establishes a contract 
    for what methods a class implementing the interface should provide, 
    without specifying how these methods should be implemented 
    The biggest difference from an Interface and Abstract Classes is that 
    in Java, a class can only instantiate one class, but can instantiate 
    as many Interfaces as they want to.*/

public interface LivingBeing {
    
    public void sleep();
    
    public void drink();
    
    public void eat();
}