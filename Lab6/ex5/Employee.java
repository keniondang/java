public class Employee {
    protected int ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;

    public Employee(){
        this.ID = 0;
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }
    public Employee(int ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }
    public Employee(int ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff){
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        int yearsWork = 2023 - yearJoined;
        if (yearsWork >= 5) {
            return yearsWork * 1150 / 100.0;
        } else {
            return 0.0;
        }
    }
    public String considerEmulation() {
        if (numDaysOff <= 1) {
            return "A";
        } else if (this.numDaysOff <= 3) {
            return "B";
        } else {
            return "C";
        }
    }
    public double getSalary() {
        double emulationCoefficient = 0.0;
        if (considerEmulation().equals("A")) {
            emulationCoefficient = 1.0;
        } else if (considerEmulation().equals("B")) {
            emulationCoefficient = 0.75;
        } else {
            emulationCoefficient = 0.5;
        }
        double senioritySalary = getSenioritySalary();
        return 1150 + 1150 * (coefficientsSalary + emulationCoefficient) + senioritySalary;
    }
}

