import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ques4 {
    //Find square of list
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
