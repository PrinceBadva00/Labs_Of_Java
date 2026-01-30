import java.util.Scanner;
import calculator.Q01_Fa;

public class Q01_Fb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Q01_Fa obj = new Q01_Fa();

        System.out.println("Sum = " + obj.sum(a, b));
        System.out.println("Product = " + obj.product(a, b));
        System.out.println("Difference = " + obj.difference(a, b));
        System.out.println("Quotient = " + obj.divison(a, b));
        sc.close();
    }
}
