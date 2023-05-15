public class testShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("blue", false);
        System.out.println(shape1.toString());

        sCircle circle1 = new sCircle(5.0, "green", true);
        System.out.println(circle1.toString());
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Perimeter of circle1: " + circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(3.0, 8.0, "orange", true);
        System.out.println(rectangle1.toString());
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle1: " + rectangle1.getPerimeter());

        Square square1 = new Square(2.0, "yellow", false);
        System.out.println(square1.toString());
        System.out.println("Area of square1: " + square1.getArea());
        System.out.println("Perimeter of square1: " + square1.getPerimeter());
        System.out.println("Side length of square1: " + square1.getSide());

        square1.setSide(6.0);
        System.out.println(square1.toString());
        System.out.println("Area of square1: " + square1.getArea());
        System.out.println("Perimeter of square1: " + square1.getPerimeter());
        System.out.println("Side length of square1: " + square1.getSide());
    }
}
