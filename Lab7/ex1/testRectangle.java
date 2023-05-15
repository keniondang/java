public class testRectangle {
    public static void main(String[] args) {
        Shapes s = new Rectangles(3.0, 4.0, "white");
        System.out.println(s.toString());
        System.out.println("Area = " + s.getArea());
        Triangle e = new Triangle(4, 5, "black");
        System.out.println(e.toString());
        System.out.println("Area = " + s.getArea());
    }
}
