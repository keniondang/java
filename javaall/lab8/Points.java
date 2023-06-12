import java.util.ArrayList;

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToOrigin() {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Points<T> {
    private ArrayList<T> points = new ArrayList<T>();

    public void add(T obj) {
        points.add(obj);
    }

    public void display() {
        for (T obj : points) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Points<Point> pointModel = new Points<Point>();

        Point point1 = new Point(0.5, 0.5);
        Point point2 = new Point(-0.5, 0.5);
        Point point3 = new Point(-0.5, -0.5);
        Point point4 = new Point(0.5, -0.5);

        pointModel.add(point1);
        pointModel.add(point2);
        pointModel.add(point3);
        pointModel.add(point4);

        System.out.println("All points:");
        pointModel.display();

        System.out.println("Points inside circle with center O(0,0) and radius 1:");
        for (Point point : pointModel.getPointsInsideCircle()) {
            System.out.println(point);
        }
    }

    public ArrayList<Point> getPointsInsideCircle() {
        ArrayList<Point> pointsInsideCircle = new ArrayList<Point>();
        for (T obj : points) {
            Point point = (Point) obj;
            if (point.distanceToOrigin() <= 1) {
                pointsInsideCircle.add(point);
            }
        }
        return pointsInsideCircle;
    }
}