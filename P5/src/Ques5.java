import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques5 {
    //Integer Stream
    public static void main(String[] args) {

        Stream<Integer> iterate = Stream.iterate(1, x -> x + 2).limit(10);
        iterate.forEach(System.out :: println);

        IntStream intStream = IntStream.iterate(0, x -> x+2).limit(10);
        intStream.forEach(System.out :: println);

        IntStream limit = Stream.generate(Math::random)
                .map(x -> x*10)
                .mapToInt(Double :: intValue)
                .limit(10);

        limit.forEach(System.out :: println);

    }
}
