import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q1_ClockSwing extends JFrame {

    JLabel label;

    Q1_ClockSwing() {
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label);

        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Timer t = new Timer(1000, e -> updateTime());
        t.start();
    }

    void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        label.setText("Time: " + sdf.format(new Date()));
    }

    public static void main(String[] args) {
        new Q1_ClockSwing();
    }
}