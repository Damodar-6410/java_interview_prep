import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ques9 {
    //find kth smallest element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.asList(1,2,2,4,5,7,2,1);
        System.out.println("Enter value of K ..");
        int k = sc.nextInt();
        Integer i = list.stream().distinct()
                .sorted()
                .skip(k - 1)
                .findFirst()
                .get();

        System.out.println(i);
    }
}
