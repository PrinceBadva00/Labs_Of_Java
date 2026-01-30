import java.util.Scanner;

interface Operations {
    void calculate(int a, int b, int c);
}

abstract class Values {
    abstract void display();
}

class Result extends Values implements Operations {

    int sum, product, largest, smallest;
    float average;

    public void calculate(int a, int b, int c) {
        sum = a + b + c;
        product = a * b * c;
        average = sum / 3.0f;

        largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
    }

    void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Product = " + product);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}

public class Q03_ThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Result r = new Result();
        r.calculate(a, b, c);
        r.display();

        sc.close();
    }


}
