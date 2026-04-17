class Fibonacci extends Thread {
    public void run() {
        int a = 1, b = 1;
        System.out.println("Fibonacci:");

        for (int i = 1; i <= 50; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

class Prime extends Thread {
    public void run() {
        System.out.println("\nPrime Numbers:");

        int count = 0, num = 2;

        while (count < 25) {
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}

public class Q06_NumberThread {
    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        Prime p = new Prime();

        f.setPriority(8);
        p.setPriority(5);

        f.start();
        p.start();
    }
}