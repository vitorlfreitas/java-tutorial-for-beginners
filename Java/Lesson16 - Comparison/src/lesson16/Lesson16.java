/* Comparison Values 

    Logical Operator &&, || and !
*/
package lesson16;

class Person {
    
    String name;
    int age;
    boolean hasGoodCredit;
    boolean hasHighIncome;
    boolean hasCriminalRecord;
    
    // Constructor
    public Person(String name, int age, boolean hasGoodCredit,
                boolean hasHighIncome, boolean hasCriminalRecord) 
    {
        this.name = name;
        this.age = age;
        this.hasGoodCredit = hasGoodCredit;
        this.hasHighIncome = hasHighIncome;
        this.hasCriminalRecord = hasCriminalRecord;
    }
    
    // Method
    public void isEligible() {
        if ((hasGoodCredit || hasHighIncome) && !hasCriminalRecord)
        System.out.println("He is Eligible");
    }
}

public class Lesson16 {
    
    public static void main(String[] args) {        
        
        Person person1 = new Person("PersonX", 23,true, true, false);
        person1.isEligible();

    }
    
}
