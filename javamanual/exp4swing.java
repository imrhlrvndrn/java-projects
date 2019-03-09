// This file is demonstrating the use of JComboBox and adding items into it as cricker,football, etc
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class exp4swing extends JApplet{
    public void init() {
        Container co = getContentPane();
        co.setLayout(new FlowLayout());
        JComboBox jc = new JComboBox();
        jc.addItem("Cricket");
        jc.addItem("Football");
        jc.addItem("Tennis");
        co.add(jc);
    }
}

// <applet code="exp4swing.class" height=700 width=700></applet>
