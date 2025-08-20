import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques7 {
    //Divide list into two part one has odd and another has even
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8};

        List<Integer> list = Arrays.stream(a).boxed()
                .collect(Collectors.toList());

        Map<Boolean, List<Integer>> collect = list.stream().
                collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));

        List<List<Integer>> collect1 = list.stream().collect(Collectors.groupingBy(x -> x%2 == 0, Collectors.toList()))
                        .entrySet().stream().map(x -> x.getValue())
                .collect(Collectors.toList());

        System.out.println(collect1);

    }
}
