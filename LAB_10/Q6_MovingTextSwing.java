import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q6_MovingTextSwing extends JFrame implements KeyListener {

    String text = " HELLO JAVA !!!  ";

    int x = 300;

    Q6_MovingTextSwing() {

        addKeyListener(this);

        Timer t = new Timer(10, e -> {
            x--;
            if (x < 0) x = 300;
            repaint();
        });

        t.start();

        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(text, x, 150);
        g.setFont(new Font("Monospaced", Font.ITALIC, 150));
        g.drawString("YourName", x, 150);
    }

    public void keyTyped(KeyEvent e) {
        text += e.getKeyChar();
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Q6_MovingTextSwing();
    }
}