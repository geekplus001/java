package ��Ͽ��б���ı�����͹�����������.J_Lines;

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
		super("�����������");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String []s = {"ѡ��1","ѡ��2","ѡ��3"};
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
