import javax.swing.*;
import java.awt.*;
import java.applet.AudioClip;

public class Q2_ImageAudioSwing extends JFrame {

    Image img;
    AudioClip audio;

    Q2_ImageAudioSwing() {
        img = Toolkit.getDefaultToolkit().getImage("image.jpg");
        audio = java.applet.Applet.newAudioClip(getClass().getResource("sound.wav"));
        audio.loop();

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 50, 50, this);
    }

    public static void main(String[] args) {
        new Q2_ImageAudioSwing();
    }
}