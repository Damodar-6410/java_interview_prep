import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques6 {
    //Multiply alternative numbers in array
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 5, 2, 6, 4};

        int reduce = IntStream.range(0, arr.length)
                .filter(x -> x % 2 == 0)
                .map(x -> arr[x])
                .reduce(1, (a, b) -> a * b);

        System.out.println(reduce);
    }
}