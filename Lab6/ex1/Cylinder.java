//Defines a public class called 'Cylinder' that extends the 'Circle' class.
public class Cylinder extends Circle {
    private double height; //The 'private' keyword is an access modifier that restricts the visibility of the 'height' variable to within the 'Cylinder' class only.

    //defines a no argument constructor
    public Cylinder(){
        //The 'super()'' keyword is used to call the constructor of the parent class, 'Circle', so when super() is called without any arguments, 
        //it invokes the default constructor of the 'Circle class', which sets the radius to 1.0 and the color to "red".
        super(); 
        this.height = 1.0;
    }

    //defines a constructor that takes a double argument 'radius' and sets the instance variable 'radius' to that value.   
    public Cylinder(double radius){
        //'super(radius)' calls the constructor of the 'Circle' class that takes a 'radius' parameter, 
        //which sets the 'radius' of the circle to the value passed as the parameter and sets the 'color' to "red".
        super(radius);
        this.height = 1.0;
    }

    //Defines a constructor that takes two arguments, a double 'radius' and a double 'height', and sets the corresponding instance variables to those values.
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        //'super(radius, color)' calls the constructor of the 'Circle' class that takes both a 'radius' and a 'color' parameter, 
        //which sets the 'radius' of the circle to the value passed as the radius parameter and sets the 'color' of the circle to the value passed as the 'color' parameter.
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return 3.14 * radius * radius * height;
    }
    
    @Override
    public String toString(){
        return "Cylinder{" + "radius = " + radius + "\'" + ", color = " + color + "\'" + ", height = " + height + "\'" + ", volume = " + getVolume() + "\'" + "}";
    }
}
