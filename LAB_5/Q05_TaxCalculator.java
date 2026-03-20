package LAB_5;

public class Q05_TaxCalculator {

    static double calculateTax(double gross) {
        return gross * 0.15;
    }

    static double calculateNetPay(int hours) {
        double gross = hours * 12;
        double tax = calculateTax(gross);
        return gross - tax;
    }

    public static void main(String[] args) {
        int hours = 40;

        double net = calculateNetPay(hours);
        System.out.println("Net Pay: " + net);
    }
}