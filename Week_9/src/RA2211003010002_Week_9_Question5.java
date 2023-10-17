import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RA2211003010002_Question5 {
    private JFrame RA2211003010002_frame;
    private JTextField RA2211003010002_First_Name, RA2211003010002_Last_Name, RA2211003010002_Phone_number, RA2211003010002_Email;

    public RA2211003010002_Question5() {
        RA2211003010002_frame = new JFrame("Employment Registration Form");
        RA2211003010002_frame.setSize(400, 400);
        RA2211003010002_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel RA2211003010002_Title = new JLabel("Employment Registration Form");
        RA2211003010002_First_Name = new JTextField(20);
        RA2211003010002_Last_Name = new JTextField(20);
        RA2211003010002_Phone_number = new JTextField(20);
        RA2211003010002_Email = new JTextField(20);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = RA2211003010002_First_Name.getText();
                String lastName = RA2211003010002_Last_Name.getText();
                String phoneNumber = RA2211003010002_Phone_number.getText();
                String email = RA2211003010002_Email.getText();
                JOptionPane.showMessageDialog(RA2211003010002_frame,
                        "Employment Registered:\nFirst Name: " + firstName +
                                "\nLast Name: " + lastName +
                                "\nPhone Number: " + phoneNumber +
                                "\nEmail: " + email);
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
        panel.add(new JLabel("Phone Number:"), gbc);

        gbc.gridy = 6;
        panel.add(RA2211003010002_Phone_number, gbc);

        gbc.gridy = 7;
        panel.add(new JLabel("Email:"), gbc);

        gbc.gridy = 8;
        panel.add(RA2211003010002_Email, gbc);

        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(registerButton, gbc);

        RA2211003010002_frame.add(panel);
        RA2211003010002_frame.setVisible(true);
    }
}

public class RA2211003010002_Week_9_Question5 {
    public static void main(String[] args) {
        new RA2211003010002_Question5();
    }
}
