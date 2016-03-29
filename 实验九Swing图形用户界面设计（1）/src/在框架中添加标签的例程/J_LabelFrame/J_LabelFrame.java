package 在框架中添加标签的例程.J_LabelFrame;

import java.awt.Container;//容器类
import java.awt.FlowLayout;//布局类
import javax.swing.ImageIcon;//图标类
import javax.swing.JFrame;//框架
import javax.swing.JLabel;//标签

public class J_LabelFrame extends JFrame
{

	public J_LabelFrame()
	{
		super("框架和标签例程");//窗口标题
		String [] s = {"文本标签","文字在图标的左侧","文字在图标的下方"};
		ImageIcon [] ic = {null,new ImageIcon("img1.png"),new ImageIcon("img2.png")};
		int [] ih = {0,JLabel.LEFT,JLabel.CENTER};
		int [] iv = {0,JLabel.CENTER,JLabel.BOTTOM};
		Container c = getContentPane();//内容窗格
		c.setLayout(new FlowLayout(FlowLayout.LEFT));//设置布局
		for(int i=0;i<3;i++)
		{
			JLabel aLabel = new JLabel(s[i],ic[i],JLabel.LEFT);
			//参数：显示的文本，对应的图标，文本排列方式
			if(i>0)
			{
				aLabel.setHorizontalTextPosition(ih[i]);//水平方向对齐方式
				aLabel.setVerticalTextPosition(iv[i]);//垂直方向对齐方式
				
			}
			aLabel.setToolTipText("第"+(i+1)+"个标签");//提示文本
			c.add(aLabel);//加入窗格
		}
		
	}
	public static void main(String[] args)
	{
		J_LabelFrame app = new J_LabelFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点x关闭
		app.setSize(360,150);//窗口大小，默认是0
		app.setVisible(true);//设置窗口可见
	}

}
