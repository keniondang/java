class Person{
    protected String name;
    protected String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person{" + "name = " + name + "\'" + ", address = " + address + "\'" + "}";
    }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return this.program;
    }
    public int getYear(){
        return this.year;
    }
    public double getFee(){
        return this.fee;
    }

    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }

    @Override
    public String toString(){
        return "Student{" + "name = " + name + "\'" + ", address = " + address + "\'" + ", program = " + program + "\'" + ", year = " + year + "\'" + ", fee = " + fee + "\'" + "}";
    }
}

class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool(){
        return this.school;
    }
    public double getPay(){
        return this.pay;
    }

    public void setSchool(String school){
        this.school = school;
    }
    public void setPay(double pay){
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "Staff{" + "name = " + name + "\'" + ", address = " + address + "\'" + ", school = " + school + "\'" + ", pay = " + pay + "\'" + "}";
    }
}

public class ex2{
    public static void main(String[] args){
        Person one = new Person("Keni", "Indonesia");
        Student oneStudent = new Student("Keni", "Indonesia", "CS", 2022, 100.000);
        Staff oneStaff = new Staff("Keni", "Indonesia", "Sophos", 100.000);

        System.out.println(one);
        System.out.println(oneStudent);
        System.out.println(oneStaff);
    }
}
