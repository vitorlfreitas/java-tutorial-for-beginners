/* Split */
package lesson27;

public class Lesson27 {

    public static void main(String[] args) {
        String phrase = "Eu sou o Vitor";
        String[] words = phrase.split("\\s+");//Split by space
        for (String word : words)
            System.out.println(word);//Output: [Eu, sou, o, Vitor]
    }
    
}
