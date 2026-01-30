import java.util.Scanner;
import figPackage.Cone;
import figPackage.Sphere;
import figPackage.Cylinder;

public class Q4_Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cone radius and height: ");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
        cone.calcArea();
        cone.calcVolume();
        cone.display();

        System.out.print("Enter sphere radius: ");
        Sphere sphere = new Sphere(sc.nextDouble());
        sphere.calcArea();
        sphere.calcVolume();
        sphere.display();

        System.out.print("Enter cylinder radius and height: ");
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        cylinder.calcArea();
        cylinder.calcVolume();
        cylinder.display();

        sc.close();
        
    }
}
