import java.applet.Applet;
import java.awt.*;

public class RA2211003010002_Week_9_Question6 extends Applet {
    public void paint(Graphics g) {
        // Set color to red
        g.setColor(Color.RED);
        
        // Draw a rectangle at (30, 30) with width 100 and height 50
        g.drawRect(30, 30, 100, 50);
        
        // Set color to green
        g.setColor(Color.GREEN);
        
        // Draw an oval inside the rectangle
        g.fillOval(30, 30, 100, 50);
        
        // Set color to blue
        g.setColor(Color.BLUE);
        
        // Draw a line from (30, 30) to (130, 80)
        g.drawLine(30, 30, 130, 80);
    }
}
