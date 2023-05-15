public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
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

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    @Override
    public String toString(){
        return "Rectangle{" + "width = " + width + "\'" + ", length = " + length + "\'" + ", area = " + getArea() + "\'" + ", perimeter = " + getPerimeter() + "\'" + ", filled = " + filled + "\'" + ", color = " + color + "\'" + "}";
    }
}
