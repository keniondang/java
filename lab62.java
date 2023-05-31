//INHERITANCE (extends, super(), override)//

class Employee{

    //Protected means it can be accessed by the subclasses.
    protected int ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;

    //No argument constructor that sets initial values.  
    public Employee(){
        this.ID = 0;
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    //Constructor with some parameters
    public Employee(int ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }

    //Constructor with all parameters
    public Employee(int ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff){
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    //Method to return a double of seniority salary
    public double getSenioritySalary(){
        int yearsWork = 2023 - yearJoined;
        if(yearsWork >= 5){
            return yearsWork * 1150 / 100.0;
        } 
        else{
            return 0.0;
        }
    }

    //Method to return a string of consider emulation
    public String considerEmulation(){
        if(numDaysOff <= 1){
            return "A";
        } 
        else if(this.numDaysOff <= 3){
            return "B";
        } 
        else{
            return "C";
        }
    }

    //Method to return a double of salary
    public double getSalary(){
        double emulationCoefficient = 0.0;
        if(considerEmulation().equals("A")){
            emulationCoefficient = 1.0;
        } 
        else if(considerEmulation().equals("B")){
            emulationCoefficient = 0.75;
        } 
        else{
            emulationCoefficient = 0.5;
        }
        double senioritySalary = getSenioritySalary();
        return 1150 + 1150 * (coefficientsSalary + emulationCoefficient) + senioritySalary;
    }
}

//The extends keyword is used to inherit the variables and methods of the parent class.
class Manager extends Employee{
    protected String position;
    protected String department;

    //Private means it can only be accessed inside Employee class.
    private double salaryCoefficientPosition;

    //No argument constructor that sets initial values.
    public Manager(){
        super();    //Calls the no argument constructor of the parent class
        this.position = "Head of Administrative Office";
        this.department = "";
        this.salaryCoefficientPosition = 5.0;
    }

    //Constructor with some parameters
    public Manager(int ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);    //Calls the constructor of the parent class
        this.position = position;
        this.department = "";
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    //Constructor with all parameters
    public Manager(int ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff, String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);    //Calls the constructor of the parent class
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    //Method to return a string of consider emulation
    @Override   //Override because this method appears in the Parent class.
    public String considerEmulation(){
        return "A";
    }

    //Method to return a double of bonus by position
    public double bonusByPosition(){
        return 1150 * salaryCoefficientPosition;
    }
   
    //Method to return a double of salary
    @Override   //Override because this method appears in the Parent class.
    public double getSalary(){
        return 1150 + 1150 * (coefficientsSalary + 1) + getSenioritySalary() + bonusByPosition();
    }
}

public class ex5{
    public static void main(String[] args){
        
        //New Employee's class object called emp1 & emp2 with some of the parameters
        Employee emp1 = new Employee(1, "Keni Nicholas Ondang", 1.4);
        Employee emp2 = new Employee(2, "Keni Nicholas", 2015, 1.1, 8);

        //New Manager's class object called mgr1 & mgr2 with some of the parameters
        Manager mgr1 = new Manager(3, "Keni Ondang", 3.0, "CEO", 12.0);
        Manager mgr2 = new Manager(4, "Keni", 2020, 1.8, 2, "Manager", "Design", 5.0);


        //Prints out a method and a variable from the Employee's class of emp1 & emp2 object
        System.out.println(emp1.fullName + " has a salary of " + emp1.getSalary());
        System.out.println(emp2.fullName + " has a salary of " + emp2.getSalary());

        //Prints out a method and two variables from the Manager's class and a variable from the Employee's class of mgr1 & mgr2 object
        System.out.println(mgr1.fullName + mgr1.department + mgr1.position + " has a salary of " + mgr1.getSalary());
        System.out.println(mgr2.fullName + mgr2.department + mgr2.position + " has a salary of " + mgr2.getSalary());
    }
}
