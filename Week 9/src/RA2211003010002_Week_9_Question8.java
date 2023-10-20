import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class RA2211003010002_Week_9_Question8 extends Applet {
    String msg = "";
    int mouseX = 0, mouseY = 0; // coordinates of mouse

    public void init() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseX = me.getX();
                mouseY = me.getY();
                msg = "Mouse clicked.";
                repaint();
            }

            public void mouseEntered(MouseEvent me) {
                mouseX = me.getX();
                mouseY = me.getY();
                msg = "Mouse entered.";
                repaint();
            }

            public void mouseExited(MouseEvent me) {
                mouseX = me.getX();
                mouseY = me.getY();
                msg = "Mouse exited.";
                repaint();
            }

            public void mousePressed(MouseEvent me) {
                mouseX = me.getX();
                mouseY = me.getY();
                msg = "Mouse pressed.";
                repaint();
            }

            public void mouseReleased(MouseEvent me) {
                mouseX = me.getX();
                mouseY = me.getY();
                msg = "Mouse released.";
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}