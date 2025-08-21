import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques4 {
    //Calculate average of all numbers

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        double collect = Arrays.stream(arr)
                .boxed()
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble();

        System.out.println(collect);


    }
}
