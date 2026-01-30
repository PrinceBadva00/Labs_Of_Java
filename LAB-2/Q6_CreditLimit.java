import java.util.Scanner;

public class Q6_CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account number: ");
        int acc = sc.nextInt();

        System.out.print("Beginning balance: ");
        int balance = sc.nextInt();

        System.out.print("Total charges: ");
        int charges = sc.nextInt();

        System.out.print("Total credits: ");
        int credits = sc.nextInt();

        System.out.print("Credit limit: ");
        int limit = sc.nextInt();

        int newBalance = balance + charges - credits;

        if (newBalance > limit)
            System.out.println("Credit limit exceeded");
        else
            System.out.println("New balance = " + newBalance);
        sc.close();
    }
}
