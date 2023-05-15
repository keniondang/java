public class testPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(2.0f, 1.0f);

        System.out.println("p1 coordinates: (" + p1.getX() + ", " + p1.getY() + ")");

        p1.setX(3.0f);
        p1.setY(4.0f);
        System.out.println("p1 new coordinates: (" + p1.getX() + ", " + p1.getY() + ")");

        Point3D p2 = new Point3D(4.0f, 6.0f, 8.0f);

        System.out.println("p2 coordinates: (" + p2.getX() + ", " + p2.getY() + ", " + p2.getZ() + ")");

        p2.setXYZ(8.0f, 9.0f, 10.0f);
        System.out.println("p2 new coordinates: (" + p2.getX() + ", " + p2.getY() + ", " + p2.getZ() + ")");
    }
}
