package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyFrame extends Frame
{

	public MyFrame()
	{
		this.setTitle("�ҵĵ�һ���������");
		this.setSize(300, 200);
		this.setBackground(Color.black);
		
		this.setResizable(false);//���ò��ɵ�����С
		this.setLocation(650,330);//���ô���λ�ã����Ͻǣ�
		this.setLayout(new FlowLayout());
		//�ڴ�����Ӱ�ť
		Button b1 = new Button("����һ��");//����һ����ť����
		this.add(b1);
		Button b2 = new Button("����һ��");//����һ����ť����
		this.add(b2);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MyFrame();
	}

}
