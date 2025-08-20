import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques5 {
    //Find the occurrence of each word
    public static void main(String[] args) {
        String s = "I am learning programming in java java java in";

        String[] str =  s.split(" ");
        Map<String,Long> map = Arrays.stream(str)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(map);
    }
}
