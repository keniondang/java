import java.util.ArrayList;

public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student1> studentModel = new PersonModel<Student1>();

        Student1 student1 = new Student1("Keni Ondang", 2003, 0001, 82.34);
        Student1 student2 = new Student1("Nicholas Ondang", 2004, 0002, 91.0);
        studentModel.add(student1);
        studentModel.add(student2);

        System.out.println("Students:");
        studentModel.display();

        PersonModel<Employee> employeeModel = new PersonModel<Employee>();

        Employee employee1 = new Employee("Keni Nicholas", 2005, 0003, 31000.0);
        Employee employee2 = new Employee("Nicholas Nicholas", 2006, 0004, 24000.0);
        employeeModel.add(employee1);
        employeeModel.add(employee2);

        System.out.println("Employees:");
        employeeModel.display();

        PersonModel<Person> personModel = new PersonModel<Person>();

        Person person1 = new Person("Keni Keni", 2007);
        Person person2 = new Person("Ondang Ondang", 2008);

        personModel.add(person1);
        personModel.add(person2);

        System.out.println("Students:");
        studentModel.display();
    }
}
