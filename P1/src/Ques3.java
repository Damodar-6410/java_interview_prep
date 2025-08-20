import java.net.SocketOption;
import java.util.Arrays;
import java.util.Comparator;

public class Ques3 {
    // nth highest word in sentence

    public static void main(String[] args) {

        String sentence = "I am learning Java programming language";
        String[] st = sentence.split(" ");

        String res = Arrays.stream(st).sorted(Comparator.comparing(String::length).
                reversed()).skip(2).findFirst().get();

        System.out.println(res);

    }
}
