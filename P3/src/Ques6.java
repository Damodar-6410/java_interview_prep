import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques6 {
    //Flat a list
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = Arrays.asList(1,2,3,4,4);
        List<Integer> l2 = Arrays.asList(4,5,6,4,7);
        List<Integer> l3 = Arrays.asList(5,5,6,7);

        list.add(l1);
        list.add(l2);
        list.add(l3);

        List<Integer>  res = list.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
