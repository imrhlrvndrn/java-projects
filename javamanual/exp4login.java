// This program creates a login program using JFrame
// This program has errors
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exp4login extends JFrame implements ActionListener{
    JLabel l,log;
    JButton b;
    JTextField t;
    public static void main(String ar[]) {
        JFrame e = new JFrame();
        e.setVisible(true);
        e.setSize(700,700);
        e.setTitle("My Login");
        e.setLayout(new GridLayout(2,2));
        l = new JLabel("Login ID");
        log = new JLabel("");
        t = new JTextField();
        b = new JButton("Submit");
        e.add(l);
        e.add(t);
        e.add(b);
        e.add(log);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String id = t.getText();
        if (id.equals("rahul")) {
            log.setText("User authenticated");
        }
    }

}