import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeDto{
    private String name;
    private double salary;

    public EmployeeDto(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Ques11 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Abc", "IT",12000));
        list.add(new Employee("Pqe", "RTO",23000));
        list.add(new Employee("Sqw", "IT",25000));
        list.add(new Employee("Qwe", "IT",40000));
        list.add(new Employee("Uyt", "RTO",32000));
        list.add(new Employee("Pou", "EY",50000));
        list.add(new Employee("Pou", "EY",40000));

        List<EmployeeDto> collect = list.stream()
                .map(emp -> new EmployeeDto(emp.getName(), emp.getSalary()))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
