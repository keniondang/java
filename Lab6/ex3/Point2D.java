public class Point2D {
    protected float x;
    protected float y;

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

    //Defines a method 'getXY' that allows a user to obtain the x and y values of the object at once
    public float[] getXY(){
        //a new 'float' array is created using the 'new' keyword, and it containts two elements,
        //which are the 'x' and 'y' values of the current 'Point2D' object, accessed using 'this' keyword.
        return new float[]{this.x, this.y}; //returns an array containing the values of x and y of the 'Point2D' object
    }

    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point2D{" + "x = " + x + "\'" + "y = " + y + "\'" + "}";
    }
}
