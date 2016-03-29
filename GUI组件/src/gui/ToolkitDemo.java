package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class ToolkitDemo extends Frame
{

	public ToolkitDemo()
	{
		this.setTitle("Toolkit�������ʹ��");
		this.setSize(600, 400);
		this.setBackground(Color.black);
		
//		this.setResizable(false);//���ÿɵ�����С
		//��ȡ���߶���
		Toolkit tool = Toolkit.getDefaultToolkit();
		//�õ���ǰ��Ļ�ߴ�
		Dimension d = tool.getScreenSize();
		
		double h = d.getHeight();
		double w = d.getWidth();
		
		int x = (int)(w-600)/2;
		int y = (int)(h-400)/2;
		
		
		
		URL url = this.getClass().getClassLoader().getResource("images/19016-WezXvz.jpg");
		Image image = tool.getImage(url);
		//���ô���ͼ��
		this.setIconImage(image);
		
		
		
		
		this.setLocation(x,y);//���ô���λ�ã����Ͻǣ�
		this.setLayout(new FlowLayout());
		
	
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ToolkitDemo();
	}

}
