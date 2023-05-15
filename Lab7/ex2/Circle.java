public class Circle extends Shape {
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

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean equals(Shape s) {
        if (s instanceof Circle) {
            Circle tmp = (Circle) s;
            if (this.getArea() == tmp.getArea()) {
                return true;
            }
        }
        return false;
    }    

    public String toString(){
        return "Circle{" + "radius = " + radius + ", color = " + color + ", filled = " + filled + ", area = " + getArea() + ", perimeter = " + getPerimeter() + "}";
    }
}
