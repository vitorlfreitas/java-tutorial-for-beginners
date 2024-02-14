package lesson30;

/*
    A compile time means that the Java will decide which method call based on 
    the parameters provided. In other words, we can create as many methods with
    the same name as we want as long as they have different validation. So 
    before we run the code, Java will automatically decide which method to call.
*/
public class CompileTimePolymorphism {

    public static void main(String[] args) {
        
        boolean mobilePhone = true;
        boolean login = true;
        boolean password = true;
        
        Validation totem1 = new Validation();
        
        totem1.validate(mobilePhone);
        
        totem1.validate(login, password);
        
    }
    
}
