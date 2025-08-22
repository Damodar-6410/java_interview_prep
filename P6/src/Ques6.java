import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    private String name;
    private String department;

    public Emp(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Ques6 {
    //Find the department with maximum people
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp("Abc", "IT"));
        list.add(new Emp("Pqe", "RTO"));
        list.add(new Emp("Sqw", "IT"));
        list.add(new Emp("Qwe", "IT"));
        list.add(new Emp("Uyt", "RTO"));
        list.add(new Emp("Pou", "EY"));

        Map<String, Long> map = list.stream()
                .collect(Collectors
                        .groupingBy(Emp::getDepartment,
                                Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(stringLongEntry);

    }
}
