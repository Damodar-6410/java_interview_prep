import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ques2 {
    //Remove non-digit char from string
    public static void main(String[] args) {
        String[] str = {"abc123","34we","456rt","132er","44"};
        Pattern pattern = Pattern.compile("[^0-9]");

        List<String> collect = Arrays.stream(str)
                .map(x -> pattern.matcher(x).replaceAll(""))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
