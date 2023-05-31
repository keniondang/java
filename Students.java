//COLLECTIONS OF DATA (ArrayList)//

//To use ArrayList functions
import java.util.ArrayList;

abstract class Student{
    protected String sName;
    protected double gpa;
    
    public Student(String sName, double gpa){
        this.sName = sName;
        this.gpa = gpa;
    }
    
    public abstract String getRank();
    
    @Override
    public String toString(){
        return "Name: " + sName + ", GPA: " + gpa + ", Rank: " + getRank();
    }
}

class ITStudent extends Student{
    private int sID;
    
    public ITStudent(String sName, double gpa, int sID) {
        super(sName, gpa);
        this.sID = sID;
    }
    
    @Override
    public String getRank(){
        if(gpa <= 5){
            return "C";
        } 
        else if(gpa <= 8){
            return "B";
        } 
        else{
            return "A";
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", ID: " + sID;
    }
}

class MathStudent extends Student{
    private String sID;
    
    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }
    
    @Override
    public String getRank(){
        if (gpa >= 5){
            return "Passed";
        } 
        else{
            return "Failed";
        }
    }
    
    public String toString(){
        return super.toString() + ", ID: " + sID;
    }
}

//<T> allows the class to work with different types of objects
public class Students{
    public static void main(String[] args){

        //Initializing a new variable with the parameterized type where <Student> specifies the type argument for the generic class Students
        ArrayList<Student> studentsList = new ArrayList<>();

        //We call the add method to add a new object of type T and declare it with the parameters
        studentsList.add(new ITStudent("Andreas", 9.3, 1234));
        studentsList.add(new ITStudent("Keni", 7.6, 5678));
        studentsList.add(new MathStudent("Nicholas", 5.5, "3105"));
        studentsList.add(new MathStudent("Ondang", 2.0, "2004"));
        
        //Create a new object of the Students class named students to store the studentsList filtered from findGPA() method
        Students students = new Students();
        ArrayList<Student> gpaList = students.findGPA(studentsList);

        //A for loop which declares a variable Student s that will hold each value of the studentsList that is filtered by the findGPA() method
        for(Student s : gpaList){
            System.out.println(s);
        }
    }

    //A method that returns an ArrayList of Student object
    public ArrayList<Student> findGPA(ArrayList<Student> studentsList){

        //New ArrayList type Student named result that will store the students with A / Passed
        ArrayList<Student> result = new ArrayList<Student>();

        //A for loop which declares a variable list of student which is a Student class that will hold each students in the ArrayList
        for(Student student : studentsList){

            //Initialize String rank by getting the student rank (call the getRank function)
            String rank = student.getRank();

            if(rank.equals("A") || rank.equals("Passed")){

                //If it is true then add the student into the ArrayList declared
                result.add(student);
            }
        }
        return result;
    }
}