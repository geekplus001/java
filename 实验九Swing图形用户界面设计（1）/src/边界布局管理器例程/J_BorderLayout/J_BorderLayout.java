package �߽粼�ֹ���������.J_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_BorderLayout 
{

	public static void main(String[] args) 
	{
		JFrame app = new JFrame("�߽粼�ֹ���������");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360,130);
		Container c = app.getContentPane();
		c.setLayout(new BorderLayout());//�˾����ɾ��
		c.add(new JButton("�|"),BorderLayout.EAST);
		c.add(new JButton("��"),BorderLayout.WEST);
		c.add(new JButton("��"),BorderLayout.SOUTH);
		c.add(new JButton("��"),BorderLayout.NORTH);
		c.add(new JButton("��"),BorderLayout.CENTER);
		app.setVisible(true);
	}

}
