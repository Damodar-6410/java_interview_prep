import java.util.stream.IntStream;

public class Ques7 {
    //Multiply 1st and last and so on in Array
    public static void main(String[] args) {
        int arr[] = {2,4,5,4,2,6};

        IntStream.range(0, arr.length/2)
                .map(x-> arr[x] * arr[arr.length-x-1])
                .forEach(System.out :: println);
    }
}
