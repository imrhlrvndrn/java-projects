// This program creates a JTree and recognizes mouseclick on it
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class exp5 extends JApplet{
	JTree tree;
	JTextField jtf;
	public void init() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Food");
		DefaultMutableTreeNode  f = new DefaultMutableTreeNode("Fruits");
		top.add(f);
		DefaultMutableTreeNode  f1 = new DefaultMutableTreeNode("Coconut");
		f.add(f1);
		DefaultMutableTreeNode  f2 = new DefaultMutableTreeNode("Mango");
		f.add(f2);
		DefaultMutableTreeNode  v = new DefaultMutableTreeNode("Veggies");
		top.add(v);
		DefaultMutableTreeNode  v1 = new DefaultMutableTreeNode("Cabbage");
		v.add(v1);
		DefaultMutableTreeNode  v2 = new DefaultMutableTreeNode("Ladiesfinger");
		v.add(v2);
		DefaultMutableTreeNode  v3 = new DefaultMutableTreeNode("Broccoli");
		v.add(v3);
		tree = new JTree(top);
		JScrollPane jsp = new JScrollPane(tree,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		c.add(jsp, BorderLayout.CENTER);
	}
}

/* 	<applet code="exp5.class" width=700 height=700>

	</applet> 
*/

