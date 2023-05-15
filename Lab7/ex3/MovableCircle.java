public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableCircle{radius = " + radius + ", center = " + center + "}";
    }

    @Override
    public void moveUp(){
        center.moveUp();
        y += ySpeed;
    }

    @Override
    public void moveDown(){
        center.moveDown();
        y -= ySpeed;
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
        x -= xSpeed;
    }

    @Override
    public void moveRight(){
        center.moveRight();
        x += xSpeed;
    }
}