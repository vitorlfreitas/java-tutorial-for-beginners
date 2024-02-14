/* Switch Case */

// For this content, watch a video about Switch Case on Youtube

package lesson19;

public class Lesson19 {

    public static void main(String[] args) {
        
        String role = "dev";
        
        switch (role) {
            case "admin":
                System.out.println("You are an Admin");
                break;
                
            case "moderator":
                System.out.println("You are a Moderator");
                break;                
                
            default:
                System.out.println("You are a Guest");
            
        }
    }
    
}
