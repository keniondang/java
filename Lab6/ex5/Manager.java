public class Manager extends Employee{
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    public Manager(){
        super();
        this.position = "Head of Administrative Office";
        this.department = "";
        this.salaryCoefficientPosition = 5.0;
    }
    public Manager(int ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.department = "";
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }
    public Manager(int ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff, String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    
    public String considerEmulation() {
        return "A";
    }
    public double bonusByPosition() {
        return 1150 * salaryCoefficientPosition;
    }
    public double getSalary() {
        return 1150 + 1150 * (coefficientsSalary + 1) + getSenioritySalary() + bonusByPosition();
    }
}
