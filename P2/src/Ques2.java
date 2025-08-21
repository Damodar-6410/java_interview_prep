import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques2 {
    //List of String that contains integer only
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","123","xyz","234");

        List<Integer> list1 =  list.stream()
                .filter(x-> x.matches("[0-9]+"))
                .map(Integer :: valueOf)
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}