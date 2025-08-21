import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ques5 {
    //Find distinct odd numbers
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,5,6,7,7,8,8,9);

        List<Integer> collect = list.stream().distinct().
                filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
