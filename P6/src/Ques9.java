import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques9 {
    //Convert list of string into map of String and its equivalent length
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana","Mango","Apple","Orange","Orange");

        Map<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(
                        fruit -> fruit,
                        String::length,
                        (existing,duplicate) -> existing
                ));
        System.out.println(collect);
    }
}