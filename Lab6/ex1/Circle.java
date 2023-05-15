public class Circle{
    protected double radius; //protected means it can be accessed by the subclasses.
    protected String color;
    protected final double PI = Math.PI; //final constant that represents the mathematical constant pi.
    
    //defines a no argument constructor
    public Circle(){ 
        this.radius = 1.0;
        this.color = "red";
    }

    //defines a constructor that takes a double argument 'radius' and sets the instance variable 'radius' to that value.
    public Circle(double radius){
        this.radius = radius; 
        this.color = "red";
    }

    //Defines a constructor that takes two arguments, a double 'radius' and a String 'color', and sets the corresponding instance variables to those values.
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //Defines a getter method 'getRadius' that returns the value of the 'radius' instance variable.
    public double getRadius(){
        return this.radius;
    }

    //Defines a getter method 'getColor' that returns the value of the 'color' instance variable.
    public String getColor(){
        return this.color;
    }

    //Defines a setter method 'setRadius' that takes a double argument 'radius' and sets the 'radius' instance variable to that value.
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Defines a setter method 'setColor' that takes a String argument 'color' and sets the 'color' instance variable to that value.
    public void setColor(String color){
        this.color = color;
    }

    //Defines a method 'getArea' that calculates and returns the area of the circle using the 'PI' constant and the 'radius' instance variable.
    public double getArea(){
        return 3.14 * radius * radius;
    }

    //The 'toString()'' method for the 'Circle' class has been overridden to provide a customized string representation of a 'Circle' object.
    @Override
    public String toString(){
        return "Circle{" + "radius = " + radius + "\'" + ", color = " + color + "\'" + ", area = " + getArea() + "\'" + "}";
    }
}