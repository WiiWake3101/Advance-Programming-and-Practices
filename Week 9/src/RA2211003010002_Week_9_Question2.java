import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RA2211003010002 {
    private JFrame RA2211003010002_frame;
    private JLabel RA2211003010002_label;

    public RA2211003010002() {
        RA2211003010002_frame = new JFrame("RA2211003010002 Week 9 Question 2");
        RA2211003010002_frame.setSize(400, 500);
        RA2211003010002_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RA2211003010002_label = new JLabel("RA2211003010002 Week 9 Question 2", SwingConstants.CENTER);
        JButton RA2211003010002_button = new JButton("Test for ActionListener");
        RA2211003010002_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RA2211003010002_label.setText("Test Success");
            }
        });
        
        RA2211003010002_frame.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(50, 0, 0, 0);
        RA2211003010002_frame.add(RA2211003010002_label, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(10, 0, 0, 0);
        RA2211003010002_frame.add(RA2211003010002_button, gridBagConstraints);
        RA2211003010002_frame.setVisible(true);
    }
}

public class RA2211003010002_Week_9_Question2 {
    public static void main(String[] args) {
        new RA2211003010002();
    }
}
