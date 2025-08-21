import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques4 {
    //find the product of first two element of array

    public static void main(String[] args) {

        int arr[] = {12,4,5,6,7,8};

        int reduce = Arrays.stream(arr).boxed()
                .collect(Collectors.toList())
                .stream()
                .limit(3)
                .reduce(1, (x, y) -> x * y);

        System.out.println(reduce);

        int x=1;
        for(int i=0;i<2;i++){
            x = x * arr[i];
        }
        System.out.println(x);
    }
}
