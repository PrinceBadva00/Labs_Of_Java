class Date {
    private int day, month, year;

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class Q4_DateTest {
    public static void main(String[] args) {
        Date d = new Date(22, 1, 2026);
        d.displayDate();
    }
}
