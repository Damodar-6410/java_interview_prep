import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques4 {
    //Find the name start with A
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abc","Ahj","Yuc","Wer","Qwe");

        Stream<String> stream1 = names.stream()
                .filter(x -> x.startsWith("A"));

        stream1.forEach(System.out :: println);

        try {
            long count = names.stream()
                    .filter(x -> x.startsWith("A")).count();
            System.out.println(count);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
