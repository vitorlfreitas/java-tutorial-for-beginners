/* *** Strings *** */
package lesson05;

public class Lesson05 {

    public static void main(String[] args) {
        
        String message = "Hello ";
        String message2 = "World" + "!!";
        String fullMessage = message + message2;
        
        System.out.println(message + message2);
        
        System.out.println(message2.endsWith("!!"));             // Outcome: true
        System.out.println(message.startsWith("H"));
        // Outcome: true
        System.out.println(message.length());
        // Outcome: 6
        System.out.println(message.indexOf("l"));
        // Outcome: 2 index of the first "l" found
        System.out.println(message.indexOf("you"));
        // Outcome: -1, cause there isnt any "You"
        System.out.println(fullMessage.replace("!!", "**"));
        // Outcome: Hello World**
        System.out.println(fullMessage.replace("!!", "!"));
        // Outcome: Hello World!
        System.out.println(message.lastIndexOf("l"));
        // Outcome: 3
        System.out.println(fullMessage.toLowerCase());
        // Outcome: hello world!!
        System.out.println(fullMessage.toUpperCase());
        // Outcome: HELLO WORLD!!
        
        // Funtion which takes the white space off
        String phrase = "     Olá, Mundo! Meu nome é Vitor";
        System.out.println(phrase.trim());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
