package figPackage;

public class Sphere extends Figure {

    double r;

    public Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        area = 4 * pi * r * r;
    }

    public void calcVolume() {
        volume = (4 * pi * r * r * r) / 3;
    }
}
