package lesson33;

/*  Inheritance allows a class (called a subclass or derived class) to inherit 
    properties and behaviors (methods and fields) 
    from an existing class (called a superclass or base class) */
public class Inheritenace {

    public static void main(String[] args) {
        
        Mage mage1 = new Mage("Merlim", 100, "Staff");
        
        // Using a method that belongs to the Character class
        mage1.attack();
        
        mage1.defend();
        
        mage1.summon();
        
        mage1.ultimateSummon();
        // Mage has summoned the Undead Frozen Dragon
    }
    
}
