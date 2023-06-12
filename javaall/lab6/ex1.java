class Circle{
    //protected means it can be accessed by the subclasses.
    protected double radius; 
    protected String color;
    protected final double PI = Math.PI; //final constant that represents the mathematical constant pi.
    
    //No argument constructor that sets initial values.
    public Circle(){ 
        this.radius = 1.0;
        this.color = "red";
    }

    //Constructor with double radius parameter.
    public Circle(double radius){
        this.radius = radius; 
        this.color = "red";
    }
   
    //Constructor with double radius and String color parameters.
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //Getter methods that returns the values of double radius and String color.
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    //Setter methods that sets the values of double radius and String color.
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    //Method that calculates and returns the area of the circle as a double.
    public double getArea(){
        return 3.14 * radius * radius;
    }

    //Method that returns the circle's radius, color and area as a string.
    @Override //Override because this method appears in the Object class.
    public String toString(){
        return "Circle{" + "radius = " + radius + "\'" + ", color = " + color + "\'" + ", area = " + getArea() + "\'" + "}";
    }
}

//The extends keyword is used to inherit the variables and methods of the Circle class.
class Cylinder extends Circle{
    //private means it can only be accessed inside the Cylinder class.
    private double height; 

    //No argument constructor that sets initial values.
    public Cylinder(){
        super(); //calls the no argument constructor of the Circle class
        this.height = 1.0;
    }

    //Constructor with double radius parameter.
    public Cylinder(double radius){
        super(radius); //calls the constructor of the Circle class with double radius parameter 
        this.height = 1.0;
    }

    //Constructor with double radius and double height parameters.
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    //Constructor with double radius, double height, and String color parameters.
    public Cylinder(double radius, double height, String color){
        super(radius, color); //calls the constructor of the Circle class with double radius and String color parameters
        this.height = height;
    }

    //Getter method that returns the value of double height.
    public double getHeight(){
        return this.height;
    }

    //Setter methods that sets the value of double height.
    public void setHeight(double height){
        this.height = height;
    }

    //Method that calculates and returns the volume of the cylinder as a double.
    public double getVolume(){
        return 3.14 * radius * radius * height;
    }

    //Method that returns the circle's radius, color and area as a string.
    @Override   //Override because this method appears in the Object class.
    public String toString(){
        return "Cylinder{" + "radius = " + radius + "\'" + ", color = " + color + "\'" + ", height = " + height + "\'" + ", volume = " + getVolume() + "\'" + "}";
    }
}

public class ex1{
    public static void main(String[] args){
        //New Circle class object called circleone with a radius and color".
        Circle circleone = new Circle(3.0, "blue");

        //New Cylinder class object called cylinderone with a radius, height and color".
        Cylinder cylinderone = new Cylinder(5.0, 3.0, "green");

        //Prints out a string method of the circleone object
        System.out.println(circleone);

        //Prints out a string method of the cylinderone object
        System.out.println(cylinderone);
    }
}
