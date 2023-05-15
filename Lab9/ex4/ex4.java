import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ex4{
    public static void main(String[] args) {

        // get specific files by extensions from a given folder.
        String folderPath = "D:\\Desktop\\java\\Lab9\\ex4";
        String extension = ".txt";
        File folder = new File(folderPath);
        if (folder.isDirectory()) {
            File[] files = folder.listFiles((dir, name) -> name.endsWith(extension));
            if (files != null) {
                System.out.println("Files with extension " + extension + " in folder " + folderPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files found with extension " + extension + " in folder " + folderPath);
            }
        } else {
            System.out.println("Invalid folder path");
        }

        // check if a file or directory specified by pathname exists or not and check if the given pathname is a directory or a file.
        String path = "D:\\Desktop\\java\\Lab9\\ex4";
        File filetxt = new File(path);
        if (filetxt.exists()) {
            System.out.println(path + " exists");
            if (filetxt.isDirectory()){
                System.out.println(path + " is a directory");
            } 
            else{
                System.out.println(path + " is a file");
            }
        } 
        else{
            System.out.println(path + " does not exist");
        }
        
        // append text to an existing file.
        String text = "My name is Keni Nicholas Ondang I am from Indonesia";
        try{
            FileWriter writer = new FileWriter("D:\\Desktop\\java\\Lab9\\ex4\\file.txt", true);
            writer.write(text);
            writer.close();
        } 
        catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        
        // find the longest word in a text file.
        String fileName = "D:\\Desktop\\java\\Lab9\\ex4\\file.txt"; 
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String longestWord = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            bufferedReader.close();
            System.out.println("Longest word in " + fileName + ": " + longestWord);
        } 
        catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
