import java.awt.geom.Area;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques1 {

    //Group A array by 0-9 10-19
    public static void main(String[] args) {
        int[] a = {2,3,4,10,11,12,20,21,22};

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

        Map<Integer, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(x -> x / 10 * 10,
                        LinkedHashMap::new,
                        Collectors.toList()));

        System.out.println(collect);
    }
}
