import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prj extends Applet implements ActionListener{
    TextField txt1,txt2,txt3,txt4,txt5,txt6,result;
    Button b;
    public void init(){
        setLayout(new GridLayout(9,2));

        txt1=new TextField();
        txt2=new TextField();
        txt3=new TextField();
        txt4=new TextField();
        txt5=new TextField();
        txt6=new TextField();
        result = new TextField();

        Label l1=new Label("Name:");
        Label l2=new Label("Address:");
        Label l3=new Label("Phone no:");
        Label l4=new Label("Email:");
        Label l5=new Label("Nature of Complaint:");
        Label l6=new Label("Action Against Complaint:");
        b=new Button("Report");

        add(l1);
        add(txt1);
        add(l2);
        add(txt2);
        add(l3);
        add(txt3);
        add(l4);
        add(txt4);
        add(l5);
        add(txt5);
        add(l6);
        add(txt6);
        add(b);
        add(result);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String n1= txt1.getText();
        String n2= txt2.getText();
        String n3= txt3.getText();
        String n4= txt4.getText();
        String n5= txt5.getText();
        String n6= txt6.getText();
        result.setText(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }

}
/*<applet code="prj.class" height=300 width=300>
</applet>
*/