package lesson30;

/* 
    There are 2 methods with the same name, but they receive differents parameters
*/

public class Validation {
    
    public void validate(boolean mobile) {
        
        if (mobile) {
            
            System.out.println("Authenticated by mobile phone");
            
        }
        else
            System.out.println("Impossible to validate");
    }
    // Same name, but with 2 parameters
    public void validate(boolean login, boolean password) {
        
        if (login && password) {
            
            System.out.println("Authenticated by login and password");
            
        }
        else
            System.out.println("Impossible to validate");
    }
}
