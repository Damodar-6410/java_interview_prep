import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Ques10 {
    //first non repeated character in string And all non repeated characters
    public static void main(String[] args) {

        String str = "Hello world";

        Character c = str.chars().mapToObj(x -> (char)x)
                .filter(x -> str.indexOf(x) == str.lastIndexOf(x))
                .findFirst()
                .get();

        System.out.println(c);
        System.out.println("----------------------------------------------------");
        str.chars().mapToObj(x -> (char)x)
                        .collect(Collectors.groupingBy(x -> x,
                                LinkedHashMap::new,
                                Collectors.counting()))
                                .entrySet().stream().filter(x -> x.getValue() == 1)
                        .map(x->x.getKey()).forEach(System.out::println);


    }
}
