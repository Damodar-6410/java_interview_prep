import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques8 {
    // min and max in Stream
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,44,5,66,4,234);


        Integer min = list.stream()
                .min(Integer::compareTo).get();

        Integer max = list.stream()
                .max(Integer::compareTo).get();

        System.out.println("Min - "+min);
        System.out.println("Max - "+max);
    }
}
