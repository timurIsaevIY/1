public class Circle {
    private final double r;
    public Circle(double r){
        this.r=r;
        if (r<=0) throw new RuntimeException("such circle doesn't exist");
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    public double getSquare(){
        return Math.PI*r*r;
    }

}
