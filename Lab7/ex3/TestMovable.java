public class TestMovable {
    public static void main(String[] args) {

        MovablePoint pt = new MovablePoint(3, 3, 5, 5);
        MovableCircle cr = new MovableCircle(1,2,3,4,5);

        System.out.println(pt.toString());

        pt.moveDown();
        pt.moveLeft();

        System.out.println(pt);

        System.out.println(cr.toString()); 

        cr.moveLeft(); 
        cr.moveUp();

        System.out.println(cr);
    }
}