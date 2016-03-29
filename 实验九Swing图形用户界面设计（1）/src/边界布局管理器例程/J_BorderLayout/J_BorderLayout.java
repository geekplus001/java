package 边界布局管理器例程.J_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_BorderLayout 
{

	public static void main(String[] args) 
	{
		JFrame app = new JFrame("边界布局管理器例程");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360,130);
		Container c = app.getContentPane();
		c.setLayout(new BorderLayout());//此句可以删除
		c.add(new JButton("東"),BorderLayout.EAST);
		c.add(new JButton("西"),BorderLayout.WEST);
		c.add(new JButton("南"),BorderLayout.SOUTH);
		c.add(new JButton("北"),BorderLayout.NORTH);
		c.add(new JButton("中"),BorderLayout.CENTER);
		app.setVisible(true);
	}

}
