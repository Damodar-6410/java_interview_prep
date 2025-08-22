import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques6 {
    //Find the department with maximum people
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Abc", "IT",12000));
        list.add(new Employee("Pqe", "RTO",23000));
        list.add(new Employee("Sqw", "IT",25000));
        list.add(new Employee("Qwe", "IT",40000));
        list.add(new Employee("Uyt", "RTO",32000));
        list.add(new Employee("Pou", "EY",50000));

        Map<String, Long> map = list.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(stringLongEntry);

    }
}
