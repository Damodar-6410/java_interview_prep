import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques8 {
    //Return character with the maximum frequency
    public static void main(String[] args) {

        String s = "abcaaauibb";
        Character value = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(x -> x,
                                Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(value);
    }
}
