import java.util.Scanner;

public class Q01_SimpleInterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate;
        int months;

        System.out.print("Enter principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter months: ");
        months = sc.nextInt();

        double years = months / 12.0;

        double interest = principal * rate * years;
        double total = principal + interest;

        System.out.println("Total Amount: " + total);
        sc.close();
    }
    
}
