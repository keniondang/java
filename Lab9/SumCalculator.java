import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SumCalculator {
    public static void main(String[] args) {
        try{
            File inputFile = new File("input.txt");
            FileReader fileReader = new FileReader(inputFile);
            int sum = 0;
            int num;
            while ((num = fileReader.read()) != -1) {
                if (Character.isDigit(num)) {
                    sum += Character.getNumericValue(num);
                }
            }
            fileReader.close();

            File outputFile = new File("output.txt");
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(Integer.toString(sum));
            fileWriter.close();
        } 
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
