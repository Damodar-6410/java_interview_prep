import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques7 {
    //Generate the first 10 numbers of the Fibonacci Sequence
    public static void main(String[] args) {
  /*      int a=0,b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10-2;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }*/

        List<Integer> list = Stream.iterate(new int[] {0,1},
                f -> new int[] {f[1],f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
