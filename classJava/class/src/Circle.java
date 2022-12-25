public class Circle {
    private final float r;
    public Circle(float r){
        this.r=r;
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    public double getSquare(){
        return Math.PI*r*r;
    }

}
