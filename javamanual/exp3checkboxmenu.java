// This program creates a Frame with a Menubar containing file,edit and view with submenus like new and open with checkboxes
import java.awt.*;

public class exp3checkboxmenu extends Frame{
    public static void main(String ar[]) {
        exp3checkboxmenu e = new exp3checkboxmenu();
        e.setTitle("My checkbox menuitems");
        e.setSize(700,700);
        e.setVisible(true);
        MenuBar mb = new MenuBar();
        e.setMenuBar(mb);
        Menu format = new Menu("Format");
        Menu help = new Menu("Help");
        mb.add(format);
        mb.add(help);
        CheckboxMenuItem wordwrap = new CheckboxMenuItem("Word wrap");
        CheckboxMenuItem font = new CheckboxMenuItem("Font");
        format.add(wordwrap);
        format.add(font);
    }
}