import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques5 {
    //Intersection of two List
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,3,5,6,7,8);
        List<Integer> list2 = Arrays.asList(2,3,4,5,9);

        List<Integer> collect = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
