package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyFrame extends Frame
{

	public MyFrame()
	{
		this.setTitle("我的第一个窗体程序");
		this.setSize(300, 200);
		this.setBackground(Color.black);
		
		this.setResizable(false);//设置不可调整大小
		this.setLocation(650,330);//设置窗体位置（左上角）
		this.setLayout(new FlowLayout());
		//在窗体添加按钮
		Button b1 = new Button("点我一下");//创建一个按钮对象
		this.add(b1);
		Button b2 = new Button("点我一下");//创建一个按钮对象
		this.add(b2);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MyFrame();
	}

}
