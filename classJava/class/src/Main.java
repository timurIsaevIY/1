import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r=input.nextDouble();

        Circle circle = new Circle(r);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());


        /*double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        Rectangle rectangle = new Rectangle(a,b,c,d);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());*/


        /*double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare());*/
    }
}