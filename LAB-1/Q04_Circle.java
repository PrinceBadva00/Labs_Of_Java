import java.util.Scanner;

public class Q04_Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        double diameter = 2 * r;
        double circumference = 2 * 3.14 * r;
        double area = 3.14 * r * r;

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);

        sc.close();
        
    }
}
