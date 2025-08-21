import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques8 {

    //Move all zero in beginning of array
    public static void main(String[] args) {
        int arr[] = {0,2,5,6,3,0,0,1,44,0};

        List<Integer> list = Arrays.stream(arr)
                .boxed().collect(Collectors.toList());

        List<Object> collect = list.stream().collect(Collectors.groupingBy(
                        x -> x != 0,
                Collectors.toList()))
                .entrySet()
                .stream()
                .flatMap(x -> x.getValue().stream())
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
