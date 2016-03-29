package 日期操作类.com.vince.date;

import java.util.Date;

public class DateDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date date = new Date();//创建一个日期对象
		System.out.println("当前时间的毫秒："+date.getTime());
		System.out.println(date);
	}

}
