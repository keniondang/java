import java.util.ArrayList;

class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public String toString() {
        return "Name: " + name + ", Birth Year: " + birthYear;
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int birthYear, int id, double score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }
    public double getScore() {
        return score;
    }

    public String toString() {
        return super.toString() + ", ID: " + id + ", Score: " + score;
    }
}

class Employee extends Person{
    private int id;
    private double salary;

    public Employee(String name, int birthYear, int id, double salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + ", ID: " + id + ", Salary: " + salary;
    }
}

public class PersonModel <T>{
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
        PersonModel<Student> studentModel = new PersonModel<Student>();

        Student student1 = new Student("Keni Ondang", 2003, 0001, 82.34);
        Student student2 = new Student("Nicholas Ondang", 2004, 0002, 91.0);
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

