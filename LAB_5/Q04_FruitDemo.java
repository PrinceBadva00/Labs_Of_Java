package LAB_5;

class Fruit {
    String name;
    String type;
    double price;

    Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    void displayFruit() {
        System.out.println(name + " " + type + " " + price);
    }
}

public class Q04_FruitDemo {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple", "Single", 100);
        Fruit f2 = new Fruit("Grapes", "Bunch", 80);

        f1.displayFruit();
        f2.displayFruit();
    }
}