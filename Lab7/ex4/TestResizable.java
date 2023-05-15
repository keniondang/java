public class TestResizable {
    public static void main(String[] args) {
        Circle4 cr = new Circle4();
        ResizableCircle rcr = new ResizableCircle();

        System.out.println("Area of circle = " + cr.getArea());
        System.out.println("Perimeter of circle = " + cr.getPerimeter());

        rcr.resize(50);

        System.out.println("Area of resizable circle = " + rcr.getArea());
        System.out.println("Perimeter of resizable circle = " + rcr.getPerimeter());
    }
    
}