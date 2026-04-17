import java.util.*;

class Player extends Thread {
    int number;

    public void run() {
        Random r = new Random();
        number = r.nextInt(100);
        System.out.println(getName() + " got: " + number);
    }
}

public class Q04_GameThread {
    public static void main(String[] args) throws Exception {

        Player p1 = new Player();
        Player p2 = new Player();

        p1.setName("Player 1");
        p2.setName("Player 2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        if (p1.number > p2.number) {
            System.out.println("Player 1 wins: " + (p1.number - p2.number));
        } else {
            System.out.println("Player 2 wins: " + (p2.number - p1.number));
        }
    }
}