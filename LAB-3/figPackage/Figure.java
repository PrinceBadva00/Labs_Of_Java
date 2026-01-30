package figPackage;

public abstract class Figure {
    protected double pi = 3.142;
    protected double area;
    protected double volume;

    public abstract void calcArea();
    public abstract void calcVolume();

    public void display() {
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}
