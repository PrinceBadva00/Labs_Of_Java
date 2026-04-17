import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3_DrawLineSwing extends JFrame {

    int x1, y1, x2, y2;

    Q3_DrawLineSwing() {

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                repaint();
            }
        });

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        new Q3_DrawLineSwing();
    }
}