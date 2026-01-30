import java.util.Scanner;

public class Q05_SeparateDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter five digit number: ");
        int num = sc.nextInt();

        System.out.println((num / 10000) + "   " +
                           (num / 1000) % 10 + "   " +
                           (num / 100) % 10 + "   " +
                           (num / 10) % 10 + "   " +
                           num % 10);

        sc.close();                   
    }
}
