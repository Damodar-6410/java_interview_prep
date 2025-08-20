import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class Ques6 {
    //Find the word with specified number of vowels

    public static void main(String[] args) {

        String s = "I am learning Stream API in java";
        String[] str = s.split(" ");

        Arrays.stream(str).filter(x -> x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);

    }
}