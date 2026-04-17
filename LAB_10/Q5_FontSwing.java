import javax.swing.*;
import java.awt.*;

public class Q5_FontSwing extends JFrame {

    Q5_FontSwing() {
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("YourName", 50, 50);

        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("YourName", 50, 100);

        g.setFont(new Font("Monospaced", Font.ITALIC, 40));
        g.drawString("YourName", 50, 150);
    }

    public static void main(String[] args) {
        new Q5_FontSwing();
    }
}