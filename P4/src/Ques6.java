import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    String name;
    String email;
    int age;

    public Employee(String name, String email, int age) {
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
public class Ques6 {
    //
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Damodar","damo@gmail.com",22));
        emp.add(new Employee("Aman","aman@yahoo.com",23));
        emp.add(new Employee("Ajay","ajay@gmail.com",34));
        emp.add(new Employee("Aakash","Aakash@cognizant.com",23));

        Map<String, Long> collect = emp.stream()
                .map(x -> x.getEmail()
                        .substring(x.getEmail().indexOf("@")+1, x.getEmail().lastIndexOf(".")))
                .collect(Collectors.groupingBy(x -> x,
                        Collectors.counting()));

        System.out.println(collect);
    }
}