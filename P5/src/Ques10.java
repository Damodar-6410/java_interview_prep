import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques10 {
    //Merge two list
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 =Arrays.asList(5,4,3,2,1);

        List<Integer> list = Stream.concat(l1.stream(),l2.stream())
                .collect(Collectors.toList());

        System.out.println(list);

        Integer reduce = list.stream()
                .reduce(0, Integer::sum);

        System.out.println(reduce);
    }
}
