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
		this.setTitle("面板程序");
		this.setSize(300, 200);
		this.setBackground(Color.black);
		
		this.setResizable(false);//设置不可调整大小
		this.setLocation(650,330);//设置窗体位置（左上角）
		this.setLayout(new FlowLayout());
		
		this.addPanel();
		this.setVisible(true);
	}
	
	public void addPanel()
	{
		Panel p1 = new Panel();
		p1.setBackground(Color.blue);
		p1.add(new Button("点我一下"));
		p1.add(new Button("点我一下"));
		p1.add(new Button("点我一下"));
		
		this.add(p1);//吧面板添加到窗体
	}
	
	public static void main(String[] args)
	{
		new PanelDemo();
	}

}
