//COLLECTIONS OF DATA (Vector)//

//To use Vector functions
import java.util.Vector;
import java.util.Scanner;

public class Vectors{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Initialize Vector X and Y with Integer data type
        Vector<Integer> X = new Vector<Integer>();
        Vector<Integer> Y = new Vector<Integer>();

        System.out.print("Enter the length of the vector: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the vector:");
        for(int i = 0; i < n; i++){
            int element = scanner.nextInt();

            //Add the elements of integers to Vector X
            X.add(element);
        }

        //A for loop that declares int x that will hold each values of X that is from the user input
        for(int x : X){
            int y = 2 * x * x + 1;

            //Add the value of y integers to Vector Y
            Y.add(y);
        }

        System.out.println("The value of vector Y is:");

        //A for loop that declares int y that will hold each values of Y that is from the calculation above
        for(int y : Y){
            System.out.print(y + " ");
        }
    }
}