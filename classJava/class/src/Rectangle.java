public class Rectangle {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    public Rectangle(double a,double b,double c,double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        if(!ExistOrnot()) throw new NullPointerException("Rectangle can't be created");
    }

    public double getPerimeter(){
        return a+b+c+d;
    }
    public double getSquare(){
        return Math.max(a,b)*Math.min(c,d);
    }
    public boolean ExistOrnot(){
        if ((a==b  && c==d) || (a==c && b==d)){
        return true;

        }
        else{
            return false;
        }
    }
}
