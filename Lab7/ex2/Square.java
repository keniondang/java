public class Square extends Rectangle{
    private double side;
    
    public Square(){
        super();
        this.side = 0.0;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
        //updates the 'width' and 'length' instance variables of the 'Rectangle' object
        this.setWidth(side); 
        this.setLength(side);
    }

    //overrides the 'setWidth' method from the 'Rectangle' class
    //this ensures that the width and length of the 'Rectangle' are always equal to the side length of the 'Square'
    @Override
    public void setWidth(double width){
        this.width = width;
        this.side = width;
        this.length = width;
    }

    @Override
    public void setLength(double length){
        this.length = length;
        this.side = length;
        this.width = length;
    }

    @Override
    public boolean equals(Shape s) {
        if (s instanceof Square) {
            Square temp = (Square) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }
}
