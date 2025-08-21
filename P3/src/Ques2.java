import java.util.Arrays;
import java.util.List;

public class Ques2 {
    //Find sum of list
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,4,5,1);

        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
