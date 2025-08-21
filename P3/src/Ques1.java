import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques1 {

    //Group Strings by middle char
    public static void main(String[] args) {
        String[] arr = {"abc","hbd","zwe","qwr"};

        Map<String, List<String>> collect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(x -> x.substring(1, 2),
                        Collectors.toList()));

        System.out.println(collect);
    }
}
