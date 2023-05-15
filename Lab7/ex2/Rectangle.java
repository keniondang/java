public class Rectangle extends Shape {
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

    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    
    @Override
    public boolean equals(Shape s) {
        if (s instanceof Rectangle) {
            Rectangle tmp = (Rectangle) s;
            if (this.getArea() == tmp.getArea()) {
                return true;
            }
        }
        return false;
    }    
    
    public String toString() {
        return "Rectangle{" + "width = " + width + ", length = " + length + ", color = " + color + ", filled = " + filled + ", area = " + getArea() + ", perimeter = " + getPerimeter() + "}";
    }
}
