//ABSTRACTION (abstract)//

//Interface which consist of a set of methods that a class can implement with their own implementations
interface Movable{

    //The set of methods
    public void moveUp();
    public void moveDown();
    public void moveRight();
    public void moveLeft();
}

//To implement the interface, use implements instead of extends
class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "MovablePoint{x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed + "}";
    }

    //Always override the methods appear in the interface
    @Override
    public void moveUp(){
        y = y + ySpeed;
    }

    //Always override the methods appear in the interface
    @Override
    public void moveDown(){
        y = y - ySpeed;
    }

    //Always override the methods appear in the interface
    @Override
    public void moveLeft(){
        x = x - xSpeed;
    }

    //Always override the methods appear in the interface
    @Override
    public void moveRight(){
        x = x + xSpeed;
    }
}

//To implement the interface, use implements instead of extends
class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString(){
        return "MovableCircle{radius = " + radius + ", center = " + center + "}";
    }

    //Always override the methods appear in the interface
    @Override
    public void moveUp(){
        center.moveUp();
        y += ySpeed;
    }

    //Always override the methods appear in the interface
    @Override
    public void moveDown(){
        center.moveDown();
        y -= ySpeed;
    }

    //Always override the methods appear in the interface
    @Override
    public void moveLeft(){
        center.moveLeft();
        x -= xSpeed;
    }
    
    //Always override the methods appear in the interface
    @Override
    public void moveRight(){
        center.moveRight();
        x += xSpeed;
    }
}

public class ex3{
    public static void main(String[] args){

        MovablePoint pt = new MovablePoint(3, 3, 5, 5);

        System.out.println(pt);

        pt.moveDown();
        pt.moveLeft();

        System.out.println(pt);

        MovableCircle cr = new MovableCircle(1,2,3,4,5);

        System.out.println(cr); 
        
        cr.moveLeft(); 
        cr.moveUp();

        System.out.println(cr);
    }
}
