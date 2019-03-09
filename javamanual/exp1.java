import java.awt.*;
import java.applet.*;
public class exp1 extends Applet{
    Button top,bottom,left,right;
    public void init(){
        top = new Button("Top");
        bottom = new Button("Bottom");
        left = new Button("Left");
        right = new Button("Right");
        setLayout(new BorderLayout());
        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
    }
}

// <applet code="exp1.class" height=400 width=400></applet>