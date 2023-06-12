interface GeometricObject {
    
    public double getArea();
    public double getPerimeter();
}

class Circle implements GeometricObject{
    protected double radius;

    public Circle(){
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

interface Resizable {
    public void resize(int percent);
}

class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(){
        super();
    }

    @Override
    public void resize(int percent){
        radius = (radius * percent) / 100;
    }
}

public class ex4{
    public static void main(String[] args) {
        Circle cr = new Circle();
        ResizableCircle rcr = new ResizableCircle();

        System.out.println("Area of circle = " + cr.getArea());
        System.out.println("Perimeter of circle = " + cr.getPerimeter());

        rcr.resize(50);

        System.out.println("Area of resizable circle = " + rcr.getArea());
        System.out.println("Perimeter of resizable circle = " + rcr.getPerimeter());
    }
    
}
