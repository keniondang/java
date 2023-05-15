public class testEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Keni Nicholas Ondang", 1.4);
        Employee emp2 = new Employee(2, "Keni Nicholas", 2015, 1.1, 8);
        Manager mgr1 = new Manager(3, "Keni Ondang", 3.0, "CEO", 12.0);
        Manager mgr2 = new Manager(4, "Keni", 2020, 1.8, 2, "Manager", "Design", 5.0);

        System.out.println(emp1.fullName + " has a salary of " + emp1.getSalary());
        System.out.println(emp2.fullName + " has a salary of " + emp2.getSalary());
        System.out.println(mgr1.fullName + " has a salary of " + mgr1.getSalary());
        System.out.println(mgr2.fullName + " has a salary of " + mgr2.getSalary());
    }
}
