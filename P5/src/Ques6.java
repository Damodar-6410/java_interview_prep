import java.util.Arrays;
import java.util.List;

public class Ques6 {
    //AllMatch, AnyMatch, NonMatch
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AhcQ","AweQ","RtyQ","GffQ");

        boolean q = list.stream()
                .allMatch(x -> x.endsWith("Q"));

        System.out.println(q);

        boolean a = list.stream()
                .anyMatch(x -> x.startsWith("A"));

        System.out.println(q);

        boolean oo = list.stream()
                .noneMatch(x -> x.contains("OO"));

        System.out.println(q);
    }
}
