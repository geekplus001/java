package �ڿ������ӱ�ǩ������.J_LabelFrame;

import java.awt.Container;//������
import java.awt.FlowLayout;//������
import javax.swing.ImageIcon;//ͼ����
import javax.swing.JFrame;//���
import javax.swing.JLabel;//��ǩ

public class J_LabelFrame extends JFrame
{

	public J_LabelFrame()
	{
		super("��ܺͱ�ǩ����");//���ڱ���
		String [] s = {"�ı���ǩ","������ͼ������","������ͼ����·�"};
		ImageIcon [] ic = {null,new ImageIcon("img1.png"),new ImageIcon("img2.png")};
		int [] ih = {0,JLabel.LEFT,JLabel.CENTER};
		int [] iv = {0,JLabel.CENTER,JLabel.BOTTOM};
		Container c = getContentPane();//���ݴ���
		c.setLayout(new FlowLayout(FlowLayout.LEFT));//���ò���
		for(int i=0;i<3;i++)
		{
			JLabel aLabel = new JLabel(s[i],ic[i],JLabel.LEFT);
			//��������ʾ���ı�����Ӧ��ͼ�꣬�ı����з�ʽ
			if(i>0)
			{
				aLabel.setHorizontalTextPosition(ih[i]);//ˮƽ������뷽ʽ
				aLabel.setVerticalTextPosition(iv[i]);//��ֱ������뷽ʽ
				
			}
			aLabel.setToolTipText("��"+(i+1)+"����ǩ");//��ʾ�ı�
			c.add(aLabel);//���봰��
		}
		
	}
	public static void main(String[] args)
	{
		J_LabelFrame app = new J_LabelFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��x�ر�
		app.setSize(360,150);//���ڴ�С��Ĭ����0
		app.setVisible(true);//���ô��ڿɼ�
	}

}
