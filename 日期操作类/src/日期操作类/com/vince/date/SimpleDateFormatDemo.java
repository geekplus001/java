package 日期操作类.com.vince.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss SSS");
		String s = sdf.format(new Date());
		
		System.out.println(s);
		
	}

}
