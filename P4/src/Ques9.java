import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques9 {
    //Group list of strings by their first character and count the number of strings
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple","banana","bigBanana","cat","cat2","cat3","dog");

        Map<Character, Long> collect = str.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0),
                        Collectors.counting()));

        System.out.println(collect);
    }
}
