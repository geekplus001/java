package 在对话框中添加标签的例程.J_FrameDialog;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_FrameDialog
{

	public static void main(String[] args)
	{
		JFrame app = new JFrame("框架");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200, 100);
		app.setVisible(true);
		
		JDialog d =new JDialog(app,"对话框",false);
		Container c = d.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(new JLabel("你好"));
		d.setSize(80, 80);
		d.setVisible(true);
	}

}
