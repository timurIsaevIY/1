public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(!ExistOrnot()) throw new NullPointerException("Triangle can't be created");
    }

    public double getPerimeter(){
        return a+b+c;
    }
    public double getSquare(){
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public boolean ExistOrnot(){
        if (a+b>c && a+c>b && b+c>a){
            return true;

        }
        else{
            return false;
        }
    }
}
