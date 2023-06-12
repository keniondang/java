import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Student{
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }
}

public class ex3{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John Doe", "S1234", 3.5));
        students.add(new Student("Jane Smith", "S5678", 4.0));
        students.add(new Student("Bob Johnson", "S9012", 2.8));
        
        //Call the method with the arguments
        writeFile("students.txt", students);
    }

    //Make the method to write students on a file with the arguments of the path and the array list
    public static <E> boolean writeFile(String path, ArrayList<E> lst){ //E means here you can call any object
        try{

            //Syntax to write a file into a path
            FileWriter writer = new FileWriter(path);

            //A for loop which declares a variable list of s which is an E class that will hold each students in the array list
            for(E s : lst){

                //We then cast that variable and make sure that E class is a Student object into a new variable called called student that is also a Student object so that we can call the getters
                Student student = (Student) s;

                //Initialize a String with the requirements for the writer
                String line = student.getName() + " - " + student.getId() + " - " + student.getGpa() + "\n";

                //Syntax to write the String into the file
                writer.write(line);
            }

            //Always close the writer
            writer.close();
            return true;    //the method is boolean so return true if there is no error occured
        }

        //Syntax to catch if there is an error
        catch(IOException e){   //Note that e is just a variable so you can name them anything
            System.out.println("An error occured.");
            e.printStackTrace();
            return false;   //the method is boolean so return false if there is an error occured
        }
    }
}