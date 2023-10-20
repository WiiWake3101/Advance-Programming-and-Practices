import javax.swing.*;

class CustomFrame extends JFrame {
    public CustomFrame() {
        setTitle("RA2211003010002 Week 9 Question 1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel RA2211003010002_label = new JLabel("RA2211003010002 Week 9 Question 1 Answer :)", SwingConstants.CENTER);
        getContentPane().add(RA2211003010002_label);
        setVisible(true);
    }
}

public class RA2211003010002_Week_9_Question1 {
    public static void main(String[] args) {
        new CustomFrame();
    }
}
