import java.util.stream.IntStream;

public class Ques5 {
    // Print the count of a particular substring
    public static void main(String[] args) {
        String s = "byebyehiihellobye";
        String check = "bye";

        long count = IntStream.range(0, s.length()-2)
                .filter(x -> s.substring(x, x+3).equals(check))
                .count();

        System.out.println(count);
    }

}
