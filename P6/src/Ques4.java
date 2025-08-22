
// Return comparison of a Person object based on first name and then last name

import java.util.ArrayList;
import java.util.List;

class Person{
    private String fName;
    private String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
public class Ques4 {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Abhi","Singh"));
        person.add(new Person("Ram","Verma"));
        person.add(new Person("Vivek","Sharma"));
        person.add(new Person("Aalakh","Pandey"));

        person.stream()
                .map(x -> x.getfName()+" "+x.getlName())
                .sorted()
                .forEach(System.out::println);
    }
}
