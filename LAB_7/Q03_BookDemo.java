
class Book {
    int id;
    String title, author;
    double price;

    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Periodical extends Book {
    String period;

    Periodical(int id, String title, String author, double price, String period) {
        super(id, title, author, price);
        this.period = period;
    }

    void update(double newPrice, String newPeriod) {
        price = newPrice;
        period = newPeriod;
    }

    void display() {
        System.out.println(id + " " + title + " " + author + " " + price + " " + period);
    }
}

public class Q03_BookDemo 
{
    public static void main(String[] args) {
        Periodical p = new Periodical(1, "Java", "ABC", 500, "Monthly");

        p.update(600, "Weekly");
        p.display();
    }
}