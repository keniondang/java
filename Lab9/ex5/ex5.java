import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex5{
    public static void main(String[] args) {
        String inputFilename = "input.txt";
        String outputFilename = "output.txt";
        
        try {
            File inputFile = new File(inputFilename);
            FileReader fileReader = new FileReader(inputFile);
            int sum = 0;
            int nextChar = fileReader.read();
            while (nextChar != -1) {
                StringBuilder number = new StringBuilder();
                while (Character.isDigit(nextChar)) {
                    number.append((char) nextChar);
                    nextChar = fileReader.read();
                }
                if (number.length() > 0) {
                    int currentNumber = Integer.parseInt(number.toString());
                    sum += currentNumber;
                }
                nextChar = fileReader.read();
            }
            fileReader.close();
            
            File outputFile = new File(outputFilename);
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(Integer.toString(sum));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
