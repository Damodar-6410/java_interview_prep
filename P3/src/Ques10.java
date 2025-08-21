import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ques10 {
    //Find kth greater element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k ..");
        int k = sc.nextInt();
        List<Integer> list = Arrays.asList(1,2,5,7,4,6,88,77,66);

        Integer i = list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(k - 1)
                .findFirst()
                .get();

        System.out.println(i);

    }
}
