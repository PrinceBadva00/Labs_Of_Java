package figPackage;

public class Cone extends Figure {

    double r, h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        double s = Math.sqrt(r * r + h * h);
        area = (pi * r * r) + (pi * r * s);
    }

    public void calcVolume() {
        volume = (pi * r * r * h) / 3;
    }
}
