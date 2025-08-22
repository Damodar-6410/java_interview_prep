import java.util.*;
import java.util.stream.Collectors;

public class Ques2 {
    //Print distinct numbers which starts with "1" in descending order
    public static void main(String[] args) {
        int arr[] = {11,22,313,3,112,135,25,1654};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .distinct()
                .filter(x -> String.valueOf(x).startsWith("1"))
                .sorted(Comparator.reverseOrder())
                .collect(
                        Collectors.toList()
                );

        System.out.println(collect);
    }
}
