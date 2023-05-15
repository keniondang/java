public class ResizableCircle extends Circle4 implements Resizable{
    public ResizableCircle(){
        super();
    }

    @Override
    public void resize(int percent){
        radius = (radius * percent) / 100;
    }
}