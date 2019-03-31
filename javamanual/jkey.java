// This program demonstrates the use of KeyListeners in java
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class jkey extends JApplet implements KeyListener {
    String msg = "";
    int x=100, y=100;

    public void init() {
        addKeyListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("key down");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("key up");
    }

    public void keyTyped(KeyEvent ke) {
        // showStatus("key down");
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }
}

/*
<applet code="jkey.class" width=700 height=700>
</applet>
*/