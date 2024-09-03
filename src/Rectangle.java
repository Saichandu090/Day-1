import java.awt.*;

public class Rectangle
{
    double length;
    double width;

    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area()
    {
        return length*width;
    }

    public double perimeter()
    {
        return 2*(length+width);
    }
}

class MainRectangle
{
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(47,6.3);
        System.out.println("Area :"+r1.area());
        System.out.println("Perimeter "+r1.perimeter());

        Rectangle r2=new Rectangle(5,54);
        System.out.println("Area :"+r2.area());
        System.out.println("Perimeter :"+r2.perimeter());
    }
}