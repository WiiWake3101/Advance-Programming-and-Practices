import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RA2211003010002_Question3{
    private JFrame RA2211003010002_frame;
    public RA2211003010002_Question3(){
        RA2211003010002_frame = new JFrame("Using Java JMenuItem and JMenu implement application swing.");
        RA2211003010002_frame.setSize(400, 300);
        RA2211003010002_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        JMenuBar RA2211003010002_menuBar = new JMenuBar();
        JMenu RA2211003010002_filemenu = new JMenu("File");
        JMenuItem RA2211003010002_OpenMenuItem = new JMenuItem("Open");
        JMenuItem RA2211003010002_saveMenuItem = new JMenuItem("Save");
        JMenuItem RA2211003010002_exitMenuItem = new JMenuItem("Exit");
        RA2211003010002_OpenMenuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(RA2211003010002_frame, "Open menu item clicked");
            }
        });
        RA2211003010002_saveMenuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(RA2211003010002_frame, "Save menu item clicked");
            }
        });
        RA2211003010002_exitMenuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(RA2211003010002_frame, "Exit menu item clicked");
                System.exit(0);
            }
        });
        RA2211003010002_filemenu.add(RA2211003010002_OpenMenuItem);
        RA2211003010002_filemenu.add(RA2211003010002_saveMenuItem);
        RA2211003010002_filemenu.add(RA2211003010002_exitMenuItem);
        RA2211003010002_menuBar.add(RA2211003010002_filemenu);
        RA2211003010002_frame.setJMenuBar(RA2211003010002_menuBar);
        RA2211003010002_frame.setVisible(true);
    }
}

public class RA2211003010002_Week_9_Question3 {
    public static void main(String args[]){
        new RA2211003010002_Question3();
    }    
}
