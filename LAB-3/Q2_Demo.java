import java.util.Scanner;

// Abstract parent class
abstract class Figure {
    double pi = 3.142;

    abstract void calcArea();
    abstract void calcVol();
    abstract void dispArea();
    abstract void dispVol();
}

// Cone class
class Cone extends Figure {
    double r, h, area, vol;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void calcArea() {
        double s = Math.sqrt(r * r + h * h);
        area = (pi * r * r) + (pi * r * s);
    }

    void calcVol() {
        vol = (pi * r * r * h) / 3;
    }

    void dispArea() {
        System.out.println("Cone Area = " + area);
    }

    void dispVol() {
        System.out.println("Cone Volume = " + vol);
    }
}

// Sphere class
class Sphere extends Figure {
    double r, area, vol;

    Sphere(double r) {
        this.r = r;
    }

    void calcArea() {
        area = 4 * pi * r * r;
    }

    void calcVol() {
        vol = (4 * pi * r * r * r) / 3;
    }

    void dispArea() {
        System.out.println("Sphere Area = " + area);
    }

    void dispVol() {
        System.out.println("Sphere Volume = " + vol);
    }
}

// Cylinder class
class Cylinder extends Figure {
    double r, h, area, vol;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void calcArea() {
        area = (2 * pi * r * r) + (2 * pi * r * h);
    }

    void calcVol() {
        vol = pi * r * r * h;
    }

    void dispArea() {
        System.out.println("Cylinder Area = " + area);
    }

    void dispVol() {
        System.out.println("Cylinder Volume = " + vol);
    }
}

// Demo class
public class Q2_Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cone input
        System.out.print("Enter radius of cone: ");
        double cr = sc.nextDouble();
        System.out.print("Enter height of cone: ");
        double ch = sc.nextDouble();

        // Sphere input
        System.out.print("Enter radius of sphere: ");
        double sr = sc.nextDouble();

        // Cylinder input
        System.out.print("Enter radius of cylinder: ");
        double cyr = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double cyh = sc.nextDouble();

        Cone cone = new Cone(cr, ch);
        Sphere sphere = new Sphere(sr);
        Cylinder cylinder = new Cylinder(cyr, cyh);

        cone.calcArea();
        cone.calcVol();
        sphere.calcArea();
        sphere.calcVol();
        cylinder.calcArea();
        cylinder.calcVol();

        cone.dispArea();
        cone.dispVol();
        sphere.dispArea();
        sphere.dispVol();
        cylinder.dispArea();
        cylinder.dispVol();
        
        sc.close();
    }
}
