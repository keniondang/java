public class Employee extends Person {
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
