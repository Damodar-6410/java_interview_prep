import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Print the Employees whose salary filtered and modified
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Ques3 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Abc",12000));
        list.add(new Employee("Xyz",23000));
        list.add(new Employee("Pqr",35000));
        list.add(new Employee("Wte",15000));
        list.add(new Employee("Dre",40000));

        list.stream()
                .filter(x -> x.getSalary() > 20000)
                .map(employee -> {
                    double sal = employee.getSalary() + 1000;
                    employee.setSalary(sal);
                    return employee;
                })
                .forEach(System.out ::println);


    }
}
