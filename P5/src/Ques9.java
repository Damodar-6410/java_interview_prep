import java.util.Arrays;
import java.util.List;

public class Ques9 {
    //List to Array
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abc","Xyz","Qwe","Ert");

        String[] str = list.stream()
                .toArray(String[]::new);

        for (String s:str){
            System.out.println(s);
        }
    }
}
