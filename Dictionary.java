//COLLECTIONS OF DATA (HashMap)//

//To use HashMap functions
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary{
    public static void main(String[] args){

        //Making a new hashmap called dict that take two parameters which both of them are String
        HashMap<String, String> dict = new HashMap<String, String>();

        //Initialize the keys and each of their value using the put method
        dict.put("foot", "ban chan");
        dict.put("topic", "chu de");
        dict.put("complete", "day du");
        dict.put("dream", "uoc mo");
        dict.put("explore", "kham pha");
        dict.put("power", "suc manh");
        dict.put("agree", "dong y");
        dict.put("improve", "nang cao");
        dict.put("chat", "tro chuyen");
        dict.put("failure", "that bai");

        Scanner scanner = new Scanner(System.in);

        while(true){ //While(true) to create an interactive program
            System.out.print("Enter a word to look up (or '1' to quit, '2' to show available words): ");

            //Scanning the input as String and make it all lowercase
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("1")){
                break;
            } 
            else if(input.equals("2")){

                //A for loop which declares String word that will hold each value (all of the keys from the hashmap) of the loop
                for(String word : dict.keySet()){   //KeySet() is a method to return a set view of the keys
                    System.out.println(word);   //Printing the variable word that contains a key from the hashmap
                }
            } 
            else{

                //Initialize String meaning to return the value of the key (from the user input) by using the get method
                String meaning = dict.get(input);

                //If the String meaning is null, it means that it cannot find the key from the user input which also means that there is no value for that 
                if (meaning == null){
                    System.out.println("Word not found in dictionary.");
                } 

                //Else we print the value of the key which is stored in String meaning
                else{
                    System.out.println("Meaning: " + meaning);
                }
            }
        }
    }
}