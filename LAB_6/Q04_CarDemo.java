abstract class Car {
    int speed = 100;

    void show() {
        System.out.println("Car speed: " + speed);
    }

    abstract void avg();
    abstract void model();
}

class Maruti extends Car {
    void avg() {
        System.out.println("Maruti Avg: 20");
    }

    void model() {
        System.out.println("Maruti Model");
    }
}

class Santro extends Car {
    void avg() {
        System.out.println("Santro Avg: 18");
    }

    void model() {
        System.out.println("Santro Model");
    }
}

public class Q04_CarDemo {
    public static void main(String[] args) {
        Car c;

        c = new Maruti();
        c.show();
        c.avg();
        c.model();

        c = new Santro();
        c.avg();
        c.model();
    }
}