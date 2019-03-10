import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jradiobutton1 extends JApplet implements ActionListener{
    JRadioButton b1,b2,b3;
    Container c;
    ButtonGroup bg;
    public void init(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b1 = new JRadioButton("Red");
        b2 = new JRadioButton("Green");
        b3 = new JRadioButton("Blue");
        bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        add(b1);
        add(b2);
        add(b3);
        b1.setActionCommand("red");
        b2.setActionCommand("green");
        b3.setActionCommand("blue");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("red")){
            c.setBackground(Color.RED);
        }
        else if(ae.getActionCommand().equals("green")){
            c.setBackground(Color.GREEN);
        }
        else if(ae.getActionCommand().equals("blue")) {
            c.setBackground(Color.BLUE);
        }
        else{
            System.out.println("Invalid option");
        }
    }
}

// <applet code="jradiobutton1.class" height=700 width=700></applet>