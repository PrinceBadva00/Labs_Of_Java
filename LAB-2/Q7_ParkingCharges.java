public class Q7_ParkingCharges {

    static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3)
            charge += (hours - 3) * 0.5;

        if (charge > 10)
            charge = 10;

        return charge;
    }

    public static void main(String[] args) {

        double[] hours = {2, 5, 10};
        double total = 0;

        for (double h : hours) {
            double fee = calculateCharges(h);
            System.out.println("Charge = " + fee);
            total += fee;
        }

        System.out.println("Total Collection = " + total);
    }
}
