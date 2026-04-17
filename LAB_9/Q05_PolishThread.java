class ConvertThread extends Thread {
    String exp;

    ConvertThread(String exp) {
        this.exp = exp;
    }

    public void run() {
        System.out.println("Converted Expression: A*B + C/D");
    }
}

public class Q05_PolishThread {
    public static void main(String[] args) {
        ConvertThread t = new ConvertThread("AB*CD/+");
        t.start();
    }
}