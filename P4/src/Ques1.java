import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques1 {
    //Remove non-numeric  from String
    public static void main(String[] args) {

        String[] str = {"abc","123","1a23","456"};

        List<String> collect = Arrays.stream(str)
                .filter(x -> x.matches("[0-9]+"))
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
