import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class People{
    String name;
    String city;
    int age;

    public People(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Ques10 {
    //Convert a list to a map
    public static void main(String[] args) {

        List<People> list = new ArrayList<>();
        list.add(new People("Damodar","Pune",22));
        list.add(new People("Aman","Pune",23));
        list.add(new People("Ajay","Bhopal",34));
        list.add(new People("Aakash","Indore",23));
        list.add(new People("Vivek","Indore",26));

        list.stream()
                .collect(Collectors.groupingBy(People :: getCity))
                .forEach((k,v) -> System.out.println(k +" "+v));
    }
}
