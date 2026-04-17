class SinThread extends Thread {
    public void run() {
        double x = Math.toRadians(30);
        System.out.println("sin(x) = " + Math.sin(x));
    }
}

class CosThread extends Thread {
    public void run() {
        double x = Math.toRadians(30);
        System.out.println("cos(x) = " + Math.cos(x));
    }
}

public class Q03_TrigThread {
    public static void main(String[] args) {
        SinThread s = new SinThread();
        CosThread c = new CosThread();

        s.start();
        c.start();
    }
}