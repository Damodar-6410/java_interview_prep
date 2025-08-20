import java.util.Arrays;
import java.util.Comparator;

public class Ques4 {

    // nth highest word length in sentence
    public static void main(String[] args) {

        String sentence = "I am learning Java programming language";
        String[] st = sentence.split(" ");
        int len = Arrays.stream(st).map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(len);
    }
}
