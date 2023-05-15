public class testCircle {
    public static void main(String[] args){
        //Declares and initializes a new 'Circle' object called 'one' with a radius of 3.0 and a color of "blue".
        Circle one = new Circle(3.0, "blue");

        //Declares and initializes a new 'Cylinder' object called 'oneCyl' with a radius of 5.0, a height of 3.0, and a color of "green".
        Cylinder oneCyl = new Cylinder(5.0, 3.0, "green");

        //Prints out a string representation of the 'one' object using the 'toString()' method and the 'println()' method of the 'System.out' object.
        System.out.println(one);

        //Prints out a string representation of the 'oneCyl' object using the 'toString()'' method and the 'println()' method of the 'System.out' object.
        System.out.println(oneCyl);
    }
}
