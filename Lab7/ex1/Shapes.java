public abstract class Shapes {
    protected String color;

    public Shapes(){
        this.color = "";
    }

    public Shapes(String color){
        this.color = color;
    }

    public abstract double getArea();

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
