/* Classes in Java */

package lesson24;

public class Lesson24 {
    
    /* I assigned a static class so then this class is totally independent.
    It is not recommended, one of the principles of oriented-object programming
    is to divided the class into files, one class per file. So, it is easier to 
    maintenace the code. Consider this example only as an example of how to 
    assign a class */
    
    // Keyword class + ClassName
    // Usually we name a class with the initial letter in Capital case
    static class Person {

        String name;
        int age;
        String job;

        // Constructor
        public Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }
    
        public void displayGreeting() {
            System.out.println("Hello, my name is " + name + "!");
        }
    
    }   

    public static void main(String[] args) {
        
        Person vitor = new Person("Vitor", 23, "Bartender");
        vitor.displayGreeting();
    }
    
}
