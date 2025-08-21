import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques8 {
    //find each character occurrence
    public static void main(String[] args) {

        String str = "mississppipp";
        String[] sp = str.split("");

        Map<String, Long> collect = Arrays.stream(sp).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect);
    }
}
