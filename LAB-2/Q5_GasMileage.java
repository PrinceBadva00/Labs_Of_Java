import java.util.Scanner;

public class Q5_GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int miles, gallons;
        int totalMiles = 0, totalGallons = 0;

        System.out.print("Enter miles (-1 to stop): ");
        miles = sc.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons: ");
            gallons = sc.nextInt();

            System.out.println("Miles per gallon = " + (double)miles / gallons);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("Enter miles (-1 to stop): ");
            miles = sc.nextInt();
        }

        if (totalGallons != 0)
            System.out.println("Overall MPG = " + (double)totalMiles / totalGallons);
         sc.close();  
    }
}
