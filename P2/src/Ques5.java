import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Ques5 {
    // Group/Pair anagram from a list of Strings

    public static void main(String[] args) {
        String arr[] = {"pan","nap","apn","Team","meat","tree"};

        Collection<List<String>> collect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(
                        x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                                        .collect(Collectors.toList())))
                .values();

        System.out.println(collect);
    }
}
