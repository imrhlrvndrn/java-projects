// This program is to demonstrate the use of GridLayout and makes a form with 3 labels and 3 textfields and a button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class exp2_1 extends Applet implements ActionListener{
    Label num1, num2, result;
    Button addition;
    TextField n1, n2, sum;
    public void init(){
        setLayout(new GridLayout(4,2));
        num1 = new Label("Enter the first number: ");
        num2 = new Label("Enter the second number: ");
        result = new Label("Addition of the two numbers are: ");
        n1 = new TextField();
        n2 = new TextField();
        sum = new TextField();
        addition = new Button("Add");
        add(num1);
        add(n1);
        add(num2);
        add(n2);
        add(result);
        add(sum);
        add(addition);
        addition.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(n1.getText());
        int num2 = Integer.parseInt(n2.getText());
        int addvalue = num1 + num2;
        sum.setText(Integer.toString(addvalue));
    }
}

// <applet code= "exp2_1.class" height=400 width=400></applet>