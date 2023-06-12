//INHERITANCE (extends, super(), override)//

//To use Arrays functions
import java.util.Arrays;

class Point2D{

    //Protected means it can be accessed by the subclasses.
    protected float x;
    protected float y;

    //No argument constructor that sets initial values.
    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    //Constructor with float x and y parameter.
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    //Getter methods that returns the values of float x and y.
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

    //Getter method that returns the value of float x and y at once as an array
    public float[] getXY(){

        //Use new datatype[]{contents} format to return it.
        return new float[]{this.x, this.y}; //returns an array containing the values of x and y of the 'Point2D' object
    }

    //Setter methods that sets the values of float x and y.
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }

    //Setter method that sets the value of float x and y at once as an array
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    //Method that returns Point2D's variables as a string.
    @Override   //Override because this method appears in the Object class.
    public String toString(){
        return "Point2D{" + "x = " + x + "\'" + "y = " + y + "\'" + "}";
    }
}

//The extends keyword is used to inherit the variables and methods of the parent class.
class Point3D extends Point2D{

    //Private means it can only be accessed inside Point3D class.
    private float z;

    //No argument constructor that sets initial values.
    public Point3D(){
        super();    //Calls the no argument constructor of the parent class
        this.z = 0.0f;
    }

    //Constructor with float x, y, and z parameters.
    public Point3D(float x, float y, float z){
        super(x, y);    //Calls the constructor of the parent class with float x and y parameters
        this.z = z;
    }

    //Getter method that returns the value of float z.
    public float getZ(){
        return this.z;
    }

    //Getter method that returns the value of float x, y, and z at the same time.
    public float[] getXYZ(){
        //Use new datatype[]{contents} format to return it.
        return new float[]{super.getX(), super.getY(), this.z}; //Use super to call the methods of the parent class.
    }

    //Setter method that sets the value of float z.
    public void setZ(float z){
        this.z = z;
    }

    //Setter method that sets the value of float x, y, and z at the same time.
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y); //Use super to call the methods of the parent class.
        this.z = z;
    }
    
    //Method that returns Point3D's variables as a string.
    @Override   //Override because this method appears in the Object class.
    public String toString(){
        return "Point3D{" + "x = " + x + "\'" + "y = " + y + "\'" + "z = " + z + "\'" + "}";
    }
}

public class ex3{
    public static void main(String[] args){

        //New Point2D's class object called point1 with the parameters of float x and y
        Point2D point1 = new Point2D(2.0f, 1.0f);

        //Prints out string method/s of the point1 object
        System.out.println(point1);

        //Sets the new value of x in point1 object by using the setter method.
        point1.setX(3.0f);

        //Prints out the value of float x in the point1 object by calling the getter method
        System.out.println(point1.getX());

        //New Point3D's class object called point2 with the parameters of float x, y, and z
        Point3D point2 = new Point3D(4.0f, 6.0f, 8.0f);

        //Prints out the value of float x, y, and z in the point2 object by called the getter method
        float[] point2XYZ = point2.getXYZ();

        //Since it is an array, convert is first to String.
        System.out.println(Arrays.toString(point2XYZ));

        //Sets the new value of x, y, and z in point2 object by using the setter method.
        point2.setXYZ(8.0f, 9.0f, 10.0f);

        //Prints out the value of float x in the point1 object by calling the getter method
        System.out.println(point2);
    }
}
