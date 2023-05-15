public class Circle4 implements GeometricObject{
    protected double radius;

    public Circle4(){
        this.radius = 10;
    }

    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
}