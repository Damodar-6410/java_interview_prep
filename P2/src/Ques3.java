import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques3 {

    //List of String that contain Char only
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","123","ert","424","w@2","ABC");
        List<String> collect = list.stream()
                .filter(x -> x.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
