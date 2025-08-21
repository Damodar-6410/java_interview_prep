import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques3 {
    //Convert list of String to uppercase
    public static void main(String[] args) {
        String[] str = {"khandwa","indore","bhopal"};

        List<String> collect = Arrays.stream(str)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
