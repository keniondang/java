abstract class Shape {
    protected String color;

    public Shape(){
        this.color = "";
    }

    public Shape(String color){
        this.color = color;
    }

    public abstract double getArea();

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        this.length = 0;
        this.width = 0;
    }
    
    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length + this.width) * 2.0;
    }

    public String toString(){
        return "Rectangle {" + "length = " + length + ", width =" + width +  ", color =" + color + "}";
    }
}

class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(){
        super();
        this.base = 0;
        this.height = 0;
    }

    public Triangle(double base, double height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return this.base * this.height * 0.5;
    }

    public String toString(){
        return "Triangle {" + "base = " + base + ", height =" + height +  ", color =" + color + "}";
    }
}

public class ex1{
    public static void main(String[] args) {
        Shape s = new Rectangle(3.0, 4.0, "white");
        System.out.println(s.toString());
        System.out.println("Area = " + s.getArea());
        Triangle e = new Triangle(4, 5, "black");
        System.out.println(e.toString());
        System.out.println("Area = " + s.getArea());
    }
}

