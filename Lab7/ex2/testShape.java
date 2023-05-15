public class testShape {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        
        Shape largestShape = null;
        for (Shape shape : shapes) {
            if (largestShape == null || shape.getArea() > largestShape.getArea()) {
                largestShape = shape;
            }
        }
        
        System.out.println("The shape with the largest area is:");
        System.out.println(largestShape.toString());
    }
}