import java.util.Arrays;
import java.util.Comparator;

public class Ques1 {
    //Find the word that has the highest length in a given sentence.
    public static void main(String[] args) {

        String sentence = "I am learning Java programming language";
        String[] words = sentence.split(" ");
        String s = Arrays.stream(words)
                .max(Comparator.comparing(String::length)).get();

        System.out.println("The word with the highest length is: " + s);
    }
}
