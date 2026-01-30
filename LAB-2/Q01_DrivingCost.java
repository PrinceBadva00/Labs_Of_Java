import java.util.Scanner;

class DrivingCost   // class
{
    /*Double has more memory than float so it can store decimal value more accurately
      And also we has to do less work than float */

    
    double miles;  
    double costPerGasoline;
    double parkingFees;
    double tolls;

    DrivingCost(double m, double c, double p, double t)   // constructor
    {
        miles = m;
        costPerGasoline = c;
        parkingFees = p;
        tolls = t;
    }

    void calculateCost()   // method 
    {
        double fuelCost = miles * costPerGasoline;
        double totalCost = fuelCost + parkingFees + tolls;
        System.out.println("Daily driving cost = " + totalCost);
    }
}

class Q01_DrivingCost
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Enter cost per gasoline: ");
        double cost = sc.nextDouble();

        System.out.print("Enter parking fees: ");
        double fees = sc.nextDouble();

        System.out.print("Enter tolls: ");
        double tolls = sc.nextDouble();

        DrivingCost d = new DrivingCost(miles, cost, fees, tolls);
        d.calculateCost();
        sc.close();
        
    }
    
}
