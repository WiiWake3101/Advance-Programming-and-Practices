import java.applet.Applet;
import java.awt.*;

public class RA2211003010002_Week_9_Question6 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(30, 30, 100, 50);
        g.setColor(Color.GREEN);
        g.fillOval(30, 30, 100, 50);
        g.setColor(Color.BLUE);
        g.drawLine(30, 30, 130, 80);
    }
}