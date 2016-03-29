package 组合框列表框文本区域和滚动窗格例程.J_Lines;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class J_Lines extends JFrame   
{
	public J_Lines()
	{
		super("多行组件例程");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String []s = {"选项1","选项2","选项3"};
		JComboBox cb = new JComboBox(s);
		JList t =new JList(s);
		JTextArea ta = new JTextArea("1\n2\n3\n4\n5",3,10);
		JScrollPane sta = new JScrollPane(ta);
		c.add(cb);
		c.add(t);
		c.add(sta);
	}
	public static void main(String[] args)
	{
		J_Lines app = new J_Lines();
		app.setSize(250,120);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

}
