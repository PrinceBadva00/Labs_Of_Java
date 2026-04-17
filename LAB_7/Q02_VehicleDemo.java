

class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    void maxSpeed() {
        System.out.println(name + " max speed: 180");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String name) {
        super(name);
    }

    void maxSpeed() {
        System.out.println(name + " max speed: 40");
    }
}

class Scooter extends Vehicle {
    Scooter(String name) {
        super(name);
    }

    void maxSpeed() {
        System.out.println(name + " max speed: 90");
    }
}

public class Q02_VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car("Car");
        Bicycle b = new Bicycle("Bicycle");
        Scooter s = new Scooter("Scooter");

        c.maxSpeed();
        b.maxSpeed();
        s.maxSpeed();
    }
}