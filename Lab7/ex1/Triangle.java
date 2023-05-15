public class Triangle extends Shapes{
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

