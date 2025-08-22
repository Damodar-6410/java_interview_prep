import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Print the Employees whose salary filtered and modified
public class Ques3 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Abc","IT",12000));
        list.add(new Employee("Xyz","IT",23000));
        list.add(new Employee("Pqr","RTO",35000));
        list.add(new Employee("Wte","IT",15000));
        list.add(new Employee("Dre","EY",40000));

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
