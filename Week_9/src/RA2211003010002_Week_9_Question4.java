import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RA2211003010002_Question4{
    private JFrame RA2211003010002_frame;
    private JTextField RA2211003010002_First_Name, RA2211003010002_Last_Name, RA2211003010002_Register_No;

    public RA2211003010002_Question4() {
        RA2211003010002_frame = new JFrame("Student Registration Form");
        RA2211003010002_frame.setSize(400, 300);
        RA2211003010002_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel RA2211003010002_Title = new JLabel("Student Registration Form");
        RA2211003010002_First_Name = new JTextField(20);
        RA2211003010002_Last_Name = new JTextField(20);
        RA2211003010002_Register_No = new JTextField(20);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = RA2211003010002_First_Name.getText();
                String lastName = RA2211003010002_Last_Name.getText();
                String registerNumber = RA2211003010002_Register_No.getText();
                JOptionPane.showMessageDialog(RA2211003010002_frame,
                        "Student Registered:\nFirst Name: " + firstName +
                                "\nLast Name: " + lastName +
                                "\nRegister Number: " + registerNumber);
            }
        });

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel.add(RA2211003010002_Title, gbc);

        gbc.gridy = 1;
        panel.add(new JLabel("First Name:"), gbc);

        gbc.gridy = 2;
        panel.add(RA2211003010002_First_Name, gbc);

        gbc.gridy = 3;
        panel.add(new JLabel("Last Name:"), gbc);

        gbc.gridy = 4;
        panel.add(RA2211003010002_Last_Name, gbc);

        gbc.gridy = 5;
        panel.add(new JLabel("Register Number:"), gbc);

        gbc.gridy = 6;
        panel.add(RA2211003010002_Register_No, gbc);

        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(registerButton, gbc);

        RA2211003010002_frame.add(panel);
        RA2211003010002_frame.setVisible(true);
    }
}

public class RA2211003010002_Week_9_Question4 {
    public static void main(String[] args) {
        new RA2211003010002_Question4();
    }
}