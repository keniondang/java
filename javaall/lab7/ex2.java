//ABSTRACTION (abstract)//

//Abstract class to allow abstract methods
abstract class Shape{
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "";
        this.filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //Abstract methods, subclass that uses this method/s needs to provide an implementation to use it.
    //Takes Shape s object as a parameter and returns a boolean value.
    public abstract boolean equals(Shape s);    //To compare objects of the class or its subclasses.
        
    public abstract double getArea();   //To calculate and return the area of an object.
    
    public abstract double getPerimeter();  //To calculate and return the perimeter of an object.

    public abstract String toString();  //To return the variable/s and/or method/s of an object as a string.
}

class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        this.radius = 0.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override 
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override  
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean equals(Shape s){
        if(s instanceof Circle){    //instanceof is used to determine whether an object is an instance of a particular class
            Circle tmp = (Circle) s;    //We cast the s that is an instance of Circle class into a new object named tmp
            if (getArea() == tmp.getArea()){    //If their area is the same then returns true
                return true;
            }
        }
        return false;   //Else it returns false
    }    

    @Override
    public String toString(){
        return "Circle{" + "radius = " + radius + ", color = " + color + ", filled = " + filled + ", area = " + getArea() + ", perimeter = " + getPerimeter() + "}";
    }
}

class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        this.width = 0.0;
        this.length = 0.0;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    
    @Override 
    public double getArea(){
        return width * length;
    }

    @Override  
    public double getPerimeter(){
        return 2 * (width + length);
    }
    
    @Override 
    public boolean equals(Shape s){
        if(s instanceof Rectangle){    //instanceof is used to determine whether an object is an instance of a particular class
            Rectangle tmp = (Rectangle) s;    //We cast the s that is an instance of Rectangle class into a new object named tmp
            if (this.getArea() == tmp.getArea()){    //If their area is the same then returns true
                return true;
            }
        }
        return false;   //Else it returns false
    }    
    
    @Override 
    public String toString(){
        return "Rectangle{" + "width = " + width + ", length = " + length + ", color = " + color + ", filled = " + filled + ", area = " + getArea() + ", perimeter = " + getPerimeter() + "}";
    }
}

class Square extends Rectangle{
    private double side;
    
    public Square(){
        super();
        this.side = 0.0;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side){

        //Sets the all of the variables from parent and subclass to side as a square have the same width and length.
        this.width = side;
        this.side = side;
        this.length = side;
    }

    @Override  
    public void setWidth(double width){

        //Sets the all of the variables from parent and subclass to side as a square have the same width and length.
        this.width = width;
        this.side = width;
        this.length = width;
    }

    @Override
    public void setLength(double length){

        //Sets the all of the variables from parent and subclass to side as a square have the same width and length.
        this.length = length;
        this.side = length;
        this.width = length;
    }

    @Override  
    public boolean equals(Shape s){
        if(s instanceof Square){    //instanceof is used to determine whether an object is an instance of a particular class
            Square temp = (Square) s;    //We cast the s that is an instance of Square class into a new object named tmp
            if (this.getArea() == temp.getArea()){    //If their area is the same then returns true
                return true;
            }
        }
        return false;   //Else it returns false
    }
}

public class ex2{
    public static void main(String[] args){

        //New array of Shape's class object called shapes that can store many objects of different classes that inherit from the Shape class
        Shape[] shapes = new Shape[5];

        //Define each array of Shape's class object
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        
        //Max = 0, null here means there is no object
        Shape largestShape = null;

        //Iterate through all of the shapes from the array
        for (int i = 0; i < shapes.length; i++){
            Shape shape = shapes[i];

            //If the largest shape is null or if the shape's area > largest shape's area then largest shape = shape
            if (largestShape == null || shape.getArea() > largestShape.getArea()){
                largestShape = shape;
            }
        }
        
        //Print largest shape
        System.out.println("The shape with the largest area is:");
        System.out.println(largestShape.toString());
    }
}
