package gui;

import java.awt.Color;
import java.awt.Frame;

/*
 * Graphics User Interface
 */
public class FrameDemo 
{

	public static void main(String[] args) 
	{
		//����һ���������
		Frame f = new Frame();
		f.setTitle("�ҵĵ�һ���������");
		f.setSize(300, 200);
		f.setBackground(Color.black);
		f.setVisible(true);
		f.setResizable(false);//���ò��ɵ�����С
		f.setLocation(650,330);//���ô���λ�ã����Ͻǣ�
	}

}
