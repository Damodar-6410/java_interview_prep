import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {

    //true if array does not contain any distinct
    public static void main(String[] args) {

        int arr[] = {0,1,3,4,5,0};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        boolean b = list.stream().collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()))
                .values()
                .stream()
                .noneMatch(x -> x > 1);
        System.out.println(b);
    }
}
