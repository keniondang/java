class Shape{
    protected String color; // Represents the color of the shape
    protected boolean filled; // Indicates if the shape is filled or not

    // Default constructor
    public Shape(){
        this.color = "red"; // Default color is red
        this.filled = true; // Default filled status is true (filled)
    }

    // Constructor with parameters
    public Shape(String color, boolean filled){
        this.color = color; // Initializes the color with the provided value
        this.filled = filled; // Initializes the filled status with the provided value
    }

    // Getter for color
    public String getColor(){
        return this.color; // Returns the color of the shape
    }

    // Getter for filled status
    public boolean isFilled(){
        return this.filled; // Returns the filled status of the shape
    }

    // Setter for color
    public void setColor(String color){
        this.color = color; // Sets the color of the shape with the provided value
    }

    // Setter for filled status
    public void setFilled(boolean filled){
        this.filled = filled; // Sets the filled status of the shape with the provided value
    }

    // String representation of the shape
    @Override
    public String toString(){
        return "Shape{" + "color = " + color + "\'" + "filled = " + filled + "\'" + "}";
    }
}

class Circle extends Shape{
    private double radius; // Represents the radius of the circle
    protected final double PI = Math.PI; // Represents the value of PI

    // Default constructor
    public Circle(){
        super(); // Calls the default constructor of the Shape class
        this.radius = 1.0; // Default radius is 1.0
    }

    // Constructor with parameters
    public Circle(double radius, String color, boolean filled){
        super(color, filled); // Calls the constructor of the Shape class with color and filled parameters
        this.radius = radius; // Initializes the radius with the provided value
    }

    // Getter for radius
    public double getRadius(){
        return this.radius; // Returns the radius of the circle
    }
    
    // Setter for radius
    public void setRadius(double radius){
        this.radius = radius; // Sets the radius of the circle with the provided value
    }

    // Calculates and returns the area of the circle
    public double getArea(){
        return PI * radius * radius;
    }

    // Calculates and returns the perimeter of the circle
    public double getPerimeter(){
        return PI * (radius * 2);
    }

    // String representation of the circle
    @Override
    public String toString(){
        return "Circle{" + "radius = " + radius + "\'" + ", color = " + color + "\'" + ", area = " + getArea() + "\'" + ", perimeter = " + getPerimeter() + "\'" + ", filled = " + filled + "\'" + "}";
    }
}

// The code for Rectangle, Square, and the main method follows the same structure with constructors, getters, setters, and string representation methods.
class Rectangle extends Shape{
    protected double width; // Represents the width of the rectangle
    protected double length; // Represents the length of the rectangle

    // Default constructor
    public Rectangle(){
        super(); // Calls the default constructor of the Shape class
        this.width = 1.0; // Default width is 1.0
        this.length = 1.0; // Default length is 1.0
    }

    // Constructor with parameters for width and length
    public Rectangle(double width, double length){
        this.width = width; // Initializes the width with the provided value
        this.length = length; // Initializes the length with the provided value
    }

    // Constructor with parameters for width, length, color, and filled status
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled); // Calls the constructor of the Shape class with color and filled parameters
        this.width = width; // Initializes the width with the provided value
        this.length = length; // Initializes the length with the provided value
    }

    // Getter for width
    public double getWidth(){
        return this.width; // Returns the width of the rectangle
    }

    // Getter for length
    public double getLength(){
        return this.length; // Returns the length of the rectangle
    }

    // Setter for width
    public void setWidth(double width){
        this.width = width; // Sets the width of the rectangle with the provided value
    }

    // Setter for length
    public void setLength(double length){
        this.length = length; // Sets the length of the rectangle with the provided value
    }

    // Calculates and returns the area of the rectangle
    public double getArea(){
        return length * width;
    }

    // Calculates and returns the perimeter of the rectangle
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    // String representation of the rectangle
    @Override
    public String toString(){
        return "Rectangle{" + "width = " + width + "\'" + ", length = " + length + "\'" + ", area = " + getArea() + "\'" + ", perimeter = " + getPerimeter() + "\'" + ", filled = " + filled + "\'" + ", color = " + color + "\'" + "}";
    }
}

class Square extends Rectangle{
    private double side; // Represents the side length of the square

    // Default constructor
    public Square(){
        super(); // Calls the default constructor of the Rectangle class
        this.side = 1.0; // Default side length is 1.0
    }

    // Constructor with parameters for side length, color, and filled status
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled); // Calls the constructor of the Rectangle class with side as both width and length
        this.side = side; // Initializes the side length with the provided value
    }

    // Getter for side length
    public double getSide(){
        return this.side; // Returns the side length of the square
    }

    // Setter for side length
    public void setSide(double side){
        this.side = side; // Sets the side length of the square with the provided value
        this.setWidth(side); // Updates the width of the square by calling the setWidth method of the Rectangle class
        this.setLength(side); // Updates the length of the square by calling the setLength method of the Rectangle class
    }

    // Overrides the setWidth method of the Rectangle class to ensure width and length are always equal to the

    //overrides the 'setWidth' method from the 'Rectangle' class
    //side length of the square
    @Override
    public void setWidth(double width){
        this.width = width; // Sets the width of the square with the provided value
        this.side = width; // Updates the side length to match the new width
        this.length = width; // Updates the length to match the new width
    }

    // Overrides the setLength method of the Rectangle class to ensure width and length are always equal to the
    // side length of the square
    @Override
    public void setLength(double length){
        this.length = length; // Sets the length of the square with the provided value
        this.side = length; // Updates the side length to match the new length
        this.width = length; // Updates the width to match the new length
    }

    // String representation of the square
    @Override
    public String toString(){
        return "Square{" + "width = " + width + "\'" + ", length = " + length + "\'" + ", side = " + side + "\'" + filled + "\'" + ", color = " + color + "\'" + "}";
    }
}

public class ex4{
    public static void main(String[] args) {
        Shape shape1 = new Shape("blue", false); // Create a Shape object with color blue and filled status false
        System.out.println(shape1.toString()); // Print the string representation of the shape1 object

        Circle circle1 = new Circle(5.0, "green", true); // Create a Circle object with radius 5.0, color green, and filled status true
        System.out.println(circle1.toString()); // Print the string representation of the circle1 object
        System.out.println("Area of circle1: " + circle1.getArea()); // Print the area of circle1
        System.out.println("Perimeter of circle1: " + circle1.getPerimeter()); // Print the perimeter of circle1
    
        Rectangle rectangle1 = new Rectangle(3.0, 8.0, "orange", true); // Create a Rectangle object with width 3.0, length 8.0, color orange, and filled status true
        System.out.println(rectangle1.toString()); // Print the string representation of the rectangle1 object
        System.out.println("Area of rectangle1: " + rectangle1.getArea()); // Print the area of rectangle1
        System.out.println("Perimeter of rectangle1: " + rectangle1.getPerimeter()); // Print the perimeter of rectangle1
    
        Square square1 = new Square(2.0, "yellow", false); // Create a Square object with side length 2.0, color yellow, and filled status false
        System.out.println(square1.toString()); // Print the string representation of the square1 object
        System.out.println("Area of square1: " + square1.getArea()); // Print the area of square1
        System.out.println("Perimeter of square1: " + square1.getPerimeter()); // Print the perimeter of square1
        System.out.println("Side length of square1: " + square1.getSide()); // Print the side length of square1
    
        square1.setSide(6.0); // Set the side length of square1 to 6.0
        System.out.println(square1.toString()); // Print the string representation of the updated square1 object
        System.out.println("Area of square1: " + square1.getArea()); // Print the area of the updated square1
        System.out.println("Perimeter of square1: " + square1.getPerimeter()); // Print the perimeter of the updated square1
        System.out.println("Side length of square1: " + square1.getSide()); // Print the side length of the updated square1
    }
}

