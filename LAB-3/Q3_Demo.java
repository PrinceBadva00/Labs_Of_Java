import java.util.Scanner;

// Parent class
class X {
    int a, b;

    X(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

// Child class
class Y extends X {

    Y(int a, int b) {
        super(a, b);
    }

    int sum() {
        return a + b;
    }
}

// Child of Y (multilevel)
class Z extends Y {

    Z(int a, int b) {
        super(a, b);
    }

    int difference() {
        return a - b;
    }

    int product() {
        return a * b;
    }
}

// Demo class
public class Q3_Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Z obj = new Z(x, y);

        System.out.println("Sum = " + obj.sum());
        System.out.println("Difference = " + obj.difference());
        System.out.println("Product = " + obj.product());

        sc.close();
        
    }
}
