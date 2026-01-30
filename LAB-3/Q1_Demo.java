import java.util.Scanner;

class Figure
{
    double r;
    double v;
    double a;
    public void displayArea()
    {
        System.out.println("Area is : "+a);
    }
    public void displayVolume()
    {
        System.out.println("Volume is : "+v);
    }
}
class Cone extends Figure
{
    double h;
    double s;
    public void calcArea()
    {
        s= Math.sqrt(r*r+h*h);

       a=(3.14*r*s)+(3.14*r*s);
    }
    public void calcVolume()
    {
        v=(3.14*r*s)/3;
    }
}
public class Q1_Demo
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);

    Cone c = new Cone();

    System.out.println("Enter the Radius of cone : ");
    c.r = sc.nextDouble();

    System.out.println("Enter the Height of cone : ");
    c.h = sc.nextDouble();

    c.calcArea();
    c.calcVolume();
    c.displayArea();
    c.displayVolume();

    sc.close();
    
    }
    
    
}
