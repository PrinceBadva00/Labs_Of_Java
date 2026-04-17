import javax.swing.*;
import java.awt.*;

public class Q4_TextAnimationSwing extends JFrame {

    int size = 6;
    boolean grow = true;

    Q4_TextAnimationSwing() {

        Timer t = new Timer(100, e -> {
            if (grow) {
                size++;
                if (size == 96) grow = false;
            } else {
                size--;
                if (size == 6) grow = true;
            }
            repaint();
        });

        t.start();

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, size));
        g.drawString("Hello", 100, 150);
    }

    public static void main(String[] args) {
        new Q4_TextAnimationSwing();
    }
}