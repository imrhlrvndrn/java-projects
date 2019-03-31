// This program does addition of two numbers
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class addition extends Applet implements ActionListener {
    TextField t1, t2, t3;

    public void init() {
        setLayout(new GridLayout(4,2));
        Label l1 = new Label("Enter the first number: ");
        Label l2 = new Label("Enter the first number: ");
        Label l3 = new Label("The addition is: ");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        Button add = new Button("Add");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(add);

        add.setActionCommand("add");
        add.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == "add") {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(Integer.toString(sum));
        }
        else {
            t3.setText("Error in performing addition");
        }
    }
}


/*
    <applet code="addition.class" width=700 height=700>
    </applet>
*/