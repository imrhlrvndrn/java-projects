// This program creates a Frame with a Menubar containing file,edit and view with submenus like new and open
import java.awt.*;

public class exp3title extends Frame{
    public static void main(String ar[]){
        exp3title e = new exp3title();
        e.setTitle("My Frame");
        e.setSize(700,700);
        e.setVisible(true);
        MenuBar mb = new MenuBar();
        e.setMenuBar(mb);
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        mb.add(file);
        mb.add(edit);
        mb.add(view);

        MenuItem new1 = new MenuItem("New");
        MenuItem open1 = new MenuItem("Open");
        file.add(new1);
        file.add(open1);
    }
}