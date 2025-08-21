import java.util.Arrays;

public class Ques9 {
    //Sum of unique elements
    public static void main(String[] args) {

        int arr[] =  {1,2,3,3,4,4,5};

        int sum = Arrays.stream(arr).distinct().sum();

        System.out.println(sum);
    }
}
