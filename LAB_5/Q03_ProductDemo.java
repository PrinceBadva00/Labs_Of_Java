package LAB_5;

class Product {
    int pid;
    String name;
    int cid;
    double price;

    Product(int pid, String name, int cid, double price) {
        this.pid = pid;
        this.name = name;
        this.cid = cid;
        this.price = price;
    }
}

class ElectricalProduct extends Product {
    int voltage;
    int watt;

    ElectricalProduct(int pid, String name, int cid, double price, int voltage, int watt) {
        super(pid, name, cid, price);
        this.voltage = voltage;
        this.watt = watt;
    }

    void update(int newWatt, double newPrice) {
        watt = newWatt;
        price = newPrice;
    }

    void display() {
        System.out.println(pid + " " + name + " " + price + " " + watt);
    }
}

public class Q03_ProductDemo {
    public static void main(String[] args) {
        ElectricalProduct e = new ElectricalProduct(1, "Fan", 101, 1500, 220, 60);
        e.update(75, 1800);
        e.display();
    }
}