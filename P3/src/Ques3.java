import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques3 {
    // Sort Array of String
    public static void main(String[] args) {
        String[] str = {"asd","qwe","ert","qwr"};

        List<String> collect = Arrays.stream(str)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
