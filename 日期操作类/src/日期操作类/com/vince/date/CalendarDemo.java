package 日期操作类.com.vince.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
//		Calendar c1 = new GregorianCalendar();
	    
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);
		String [] weeks = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		StringBuilder sb = new StringBuilder();
		sb.append(year).append("年").append(month).append("月").append(day).append("日").
		append(hour).append(":").append(minute).append(":").append(second).append(" ").
		append(millisecond).append(" ").append(weeks[week]);
	
		System.out.println(sb.toString());
		
	}

}
