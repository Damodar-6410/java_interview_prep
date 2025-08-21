import java.awt.geom.Area;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Ques11 {
    // first repeated character in String
    public static void main(String[] args) {
        String s = "Hello world";

        Character c = s.chars().mapToObj(x -> (char)x)
                .filter(x -> s.indexOf(x)!=s.lastIndexOf(x))
                .findFirst()
                .get();

        System.out.println(c);

        s.chars().mapToObj(x -> (char)x)
                        .collect(Collectors.groupingBy(x -> x,
                                LinkedHashMap::new,
                                Collectors.counting()))
                                .entrySet().stream()
                                .filter(x -> x.getValue() != 1)
                                .map(x -> x.getKey())
                                .forEach(System.out :: println);

    }
}
