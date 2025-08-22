import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques10 {
    //Convert List of Employee to Map
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Abc", "IT",12000));
        list.add(new Employee("Pqe", "RTO",23000));
        list.add(new Employee("Sqw", "IT",25000));
        list.add(new Employee("Qwe", "IT",40000));
        list.add(new Employee("Uyt", "RTO",32000));
        list.add(new Employee("Pou", "EY",50000));
        list.add(new Employee("Pou", "EY",40000));

        Map<String, Double> collect = list.stream()
                .collect(Collectors.toMap(
                        Employee::getName,
                        Employee::getSalary,
                        (a, b) -> b
                ));
        System.out.println(collect);

    }
}
