public class sCircle extends Shape {
    private double radius;
    protected final double PI = Math.PI;

    public sCircle(){
        super();
        this.radius = 1.0;
    }
    public sCircle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }
    public double getPerimeter(){
        return PI * (radius * 2);
    }

    @Override
    public String toString(){
        return "Circle{" + "radius = " + radius + "\'" + ", color = " + color + "\'" + ", area = " + getArea() + "\'" + ", perimeter = " + getPerimeter() + "\'" + ", filled = " + filled + "\'" + "}";
    }
}
