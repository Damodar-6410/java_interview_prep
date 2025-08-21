import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    String name;
    String email;
    int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Ques2 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Damodar","damo@gmail.com",22));
        list.add(new Person("Aman","aman@yahoo.com",23));
        list.add(new Person("Ajay","ajay@gmail.com",34));
        list.add(new Person("Aakash","Aakash@cognizant.com",32));

        List<String> collect = list.stream()
                .filter(x -> x.getAge() > 30)
                .map(x -> x.getName())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
