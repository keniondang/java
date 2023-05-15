public class testPerson {
    public static void main(String[] args){
        Person one = new Person("Keni", "Indonesia");
        Student oneStudent = new Student("Keni", "Indonesia", "CS", 2022, 100.000);
        Staff oneStaff = new Staff("Keni", "Indonesia", "Sophos", 100.000);

        System.out.println(one);
        System.out.println(oneStudent);
        System.out.println(oneStaff);
    }
}

