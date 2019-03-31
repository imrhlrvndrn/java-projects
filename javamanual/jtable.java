// This program demonstrates the JTable and fills the table with a set of data
import java.awt.*;
import javax.swing.*;

public class jtable extends JApplet{
    public void init() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        final String[] colHeads = {"empid", "empname","empsalary"};
        final Object[][] data = {
            {"1","Rahul Ravindran","5000000000"},
            {"2","Vitthal Samant","5"},
            {"3","Suraj Tawale","5000"},
            {"4","Swapnil Patil","0000"}
        };
        JTable table = new JTable(data, colHeads);
        JScrollPane jsp= new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        c.add(jsp, BorderLayout.CENTER);
    }
}

/*  <applet code="jtable.class" width=700 height=700>
    </applet>
*/