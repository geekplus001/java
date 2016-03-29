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
		//创建一个窗体对象
		Frame f = new Frame();
		f.setTitle("我的第一个窗体程序");
		f.setSize(300, 200);
		f.setBackground(Color.black);
		f.setVisible(true);
		f.setResizable(false);//设置不可调整大小
		f.setLocation(650,330);//设置窗体位置（左上角）
	}

}
