class Bank {
    int balance = 600;

    synchronized void deposit() throws Exception {
        while (balance < 2000) {
            int amt = (int)(Math.random() * 200);
            balance += amt;
            System.out.println("Father deposits: " + amt + " Balance: " + balance);
            notify();
            wait(100);
        }
    }

    synchronized void withdraw() throws Exception {
        while (balance > 500) {
            int amt = (int)(Math.random() * 150);
            if (balance >= amt) {
                balance -= amt;
                System.out.println("Son withdraws: " + amt + " Balance: " + balance);
            }
            notify();
            wait(100);
        }
    }
}

class Father extends Thread {
    Bank b;
    Father(Bank b) { this.b = b; }

    public void run() {
        try {
            b.deposit();
        } catch (Exception e) {}
    }
}

class Son extends Thread {
    Bank b;
    Son(Bank b) { this.b = b; }

    public void run() {
        try {
            b.withdraw();
        } catch (Exception e) {}
    }
}

public class Q07_BankThread {
    public static void main(String[] args) {

        Bank b = new Bank();

        Father f = new Father(b);
        Son s = new Son(b);

        f.start();
        s.start();
    }
}