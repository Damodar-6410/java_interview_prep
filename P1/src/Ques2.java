import java.util.Arrays;

public class Ques2 {
    //Remove duplicate characters from a string and return in the same order.
    public static void main(String[] args) {
        String s = "dabcdeabc";

//        s.chars().distinct().mapToObj(c-> (char) c)
//                .forEach(System.out::print);
        String[] ch = s.split("");

        Arrays.stream(ch).distinct()
                .forEach(System.out::print);

    }
}
