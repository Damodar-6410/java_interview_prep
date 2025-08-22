import java.util.Scanner;
import java.util.stream.IntStream;

public class Ques1 {
    //Mid-character of String
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        int length = s.length();
        int mid = length/2;

        String collect = IntStream.range(0, length)
                .filter(x -> length % 2 == 0 ? x == mid || x == mid - 1 : x == mid)
                .mapToObj(s::charAt)
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();

        System.out.println(collect);
    }
}
