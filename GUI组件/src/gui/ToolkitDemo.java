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
		this.setTitle("Toolkit工具类的使用");
		this.setSize(600, 400);
		this.setBackground(Color.black);
		
//		this.setResizable(false);//设置可调整大小
		//获取工具对象
		Toolkit tool = Toolkit.getDefaultToolkit();
		//得到当前屏幕尺寸
		Dimension d = tool.getScreenSize();
		
		double h = d.getHeight();
		double w = d.getWidth();
		
		int x = (int)(w-600)/2;
		int y = (int)(h-400)/2;
		
		
		
		URL url = this.getClass().getClassLoader().getResource("images/19016-WezXvz.jpg");
		Image image = tool.getImage(url);
		//设置窗体图标
		this.setIconImage(image);
		
		
		
		
		this.setLocation(x,y);//设置窗体位置（左上角）
		this.setLayout(new FlowLayout());
		
	
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ToolkitDemo();
	}

}
