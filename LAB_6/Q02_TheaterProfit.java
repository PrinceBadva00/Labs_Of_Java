public class Q02_TheaterProfit {

    static double calculateProfit(int people) {
        double income = people * 5;
        double cost = 20 + (0.5 * people);
        return income - cost;
    }

    public static void main(String[] args) {
        int people = 50;
        System.out.println("Profit: " + calculateProfit(people));
    }
}