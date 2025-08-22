import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

class People{
    private String name;
    private String gender;
    private int age;

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Ques7 {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People("Abc","Male",21));
        list.add(new People("Pqr","Male",22));
        list.add(new People("Xyz","Male",23));
        list.add(new People("Abc","Female",25));
        list.add(new People("Pqr","Female",26));
        list.add(new People("Xyz","Female",27));

        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(
                        People::getGender,
                        Collectors.averagingDouble(People::getAge)
                ));

        System.out.println(collect);
    }
}
