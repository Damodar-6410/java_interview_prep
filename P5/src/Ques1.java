import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Ques1 {
    // Multiply array elements
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        Optional<Integer> reduce = Arrays.stream(arr)
                .boxed()
                .reduce((a, b) -> a * b);

        System.out.println(reduce.get());
    }
}
