import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques7 {
    //Flat a list
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("odd", Arrays.asList(1,3,5,7,9));
        map.put("even", Arrays.asList(0,2,4,6,8));

        List<Integer> collect = map.entrySet().stream()
                .flatMap(x -> x.getValue().stream())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
