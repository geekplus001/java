package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelDemo extends Frame
{

	public PanelDemo()
	{
		this.setTitle("������");
		this.setSize(300, 200);
		this.setBackground(Color.black);
		
		this.setResizable(false);//���ò��ɵ�����С
		this.setLocation(650,330);//���ô���λ�ã����Ͻǣ�
		this.setLayout(new FlowLayout());
		
		this.addPanel();
		this.setVisible(true);
	}
	
	public void addPanel()
	{
		Panel p1 = new Panel();
		p1.setBackground(Color.blue);
		p1.add(new Button("����һ��"));
		p1.add(new Button("����һ��"));
		p1.add(new Button("����һ��"));
		
		this.add(p1);//�������ӵ�����
	}
	
	public static void main(String[] args)
	{
		new PanelDemo();
	}

}
