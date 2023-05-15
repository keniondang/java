import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ex3{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John Doe", "S1234", 3.5));
        students.add(new Student("Jane Smith", "S5678", 4.0));
        students.add(new Student("Bob Johnson", "S9012", 2.8));
        
        writeFile("students.txt", students);
    }

    public static <E> boolean writeFile(String path, ArrayList<E> lst) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (E s : lst) {
                Student student = (Student) s;
                String line = student.getName() + " - " + student.getId() + " - " + student.getGpa();
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
            return false;
        }
    }
}

class Student {
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
