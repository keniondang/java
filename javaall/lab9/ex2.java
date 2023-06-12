import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex2{
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");
            int character;
            while((character = reader.read()) != -1){
                char upperChar = Character.toUpperCase((char) character);
                writer.write(upperChar);
            }
            writer.close();
            reader.close();
        } 
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
