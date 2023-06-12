import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ex4{
    public static void main(String[] args) {

        //Get specific files by extensions from a given folder.
        String folderPath = "D:\\Desktop\\java\\Lab9\\ex4";
        String extension = ".txt";
        File folder = new File(folderPath);

        //First we check if that file is a directory or not
        if (folder.isDirectory()){

            //Initialize an array of File that stores the files in that directory
            File[] files = folder.listFiles();
            
            //Initialize an array of File with the amount of files found in the directory to store the files with the given extension
            File[] specificFiles = new File[files.length];
            int count = 0;

            //If there is files present
            if(files != null){

                //A for loop which declares a list of File named file that will hold each files in that directory
                for(File file : files){

                    //If that file is a file and the name ends with the desired extension
                    if(file.isFile() && file.getName().endsWith(extension)){

                        //We cast that file into the array of files that we already initialized
                        specificFiles[count] = file;    //We change the amount of files in the array of files into count
                        count++;   
                    }
                }

                //If count is more than 0 meaning there is a file with that extension
                if(count > 0){
                    System.out.println("Files with the extension of" + extension + " in folder " + folderPath + ":");
                    for (int i = 0; i < count; i++) {

                        //We print the name/s of the files
                        System.out.println(specificFiles[i].getName());
                    }
                } 
                else{
                    System.out.println("No files found with the extension of" + extension + " in folder " + folderPath);
                }
            } 
        } 
        else{
            System.out.println("Invalid folder path");
        }

        //Check if a file or directory specified by pathname exists or not and check if the given pathname is a directory or a file.
        String path = "D:\\Desktop\\java\\Lab9\\ex4\\ex4.java";

        //Syntax to make a new file based on the path
        File filetxt = new File(path);

        //Syntax to check if it exists or not
        if(filetxt.exists()){
            System.out.println(path + " exists");

            //Syntax to check if it is a directory or a file
            if(filetxt.isDirectory()){
                System.out.println(path + " is a directory");
            } 
            else{
                System.out.println(path + " is a file");
            }
        } 
        else{
            System.out.println(path + " does not exist");
        }
        
        //Append text to an existing file.
        String text = " My name is Keni Nicholas Ondang I am from Indonesia";
        try{
            FileWriter writer = new FileWriter("D:\\Desktop\\java\\Lab9\\ex4\\file.txt", true);
            writer.write(text);
            writer.close();
        } 
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        
        //Find the longest word in a text file.
        String fileName = "D:\\Desktop\\java\\Lab9\\ex4\\file.txt"; 
        try{

            //Syntax to make a new file based on the path, this is used so that it can throw FileNotFoundException
            File file = new File(fileName);

            //Syntax to read a file using scanner
            Scanner fileReader = new Scanner(file);

            //Intializing the longest word which is none
            String longestWord = "";

            //Keep on scanner/reading if it has next line
            while (fileReader.hasNextLine()){

                //Initialize a String the store the contents from the the file that is already been read
                String line = fileReader.nextLine();

                //Split the contents based on after every space and put one word into one array
                String[] words = line.split(" ");

                //A for loop which declares a variable list of word which is a string that will hold each words from the content of the file
                for(String word : words){

                    //If that word's length is more than the longestWord length
                    if(word.length() > longestWord.length()){
                        longestWord = word; //Then that word is the longest word
                    }
                }
            }

            //Always close the scanner/reader
            fileReader.close();
            System.out.println("Longest word in " + fileName + ": " + longestWord);
        } 

        //Syntax to catch if there is an error from the file
        catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
