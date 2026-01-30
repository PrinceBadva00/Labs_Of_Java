package figPackage;

public class Cylinder extends Figure {

    double r, h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        area = (2 * pi * r * r) + (2 * pi * r * h);
    }

    public void calcVolume() {
        volume = pi * r * r * h;
    }
}
