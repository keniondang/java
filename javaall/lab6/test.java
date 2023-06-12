class Shape {
    //variables
    protected int length; //length = 1
    protected int width; //width = 1

    //constructors
    public Shape(){
        this.length = 1;
        this.width = 1;
    }

    public Shape(int width){
        this.length = 1;
        this.width = width;
    }

    public Shape(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    //getters
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    //setters
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public String toString(){
        return "length = " + length + "width = " + width;
    }
    
}

class Rectangle extends Shape{
    private int hypotenuse;

    public Rectangle(){
        super();
        this.hypotenuse = 0;
    }
    public Rectangle(int length, int width){
        super(length, width);
        this.hypotenuse = 0;
    }
    public Rectangle(int length, int width, int hypotenuse){
        super(length, width);
        this.hypotenuse = hypotenuse;
    }

    public int getHypotenuse(){
        return hypotenuse;
    }
    public void setHypotenuse(int hypotenuse){
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString(){
        return "Rectangle " + super.toString() + "Hypotenuse = " + hypotenuse;
    }

}

public class test{
    public static void main(String[] args){  
        Rectangle obj1 = new Rectangle(2, 2, 2);
        
    }
}