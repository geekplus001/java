package ���ڲ�����.com.vince.date;

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
		String [] weeks = {"������","����һ","���ڶ�","������","������","������","������"};
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		StringBuilder sb = new StringBuilder();
		sb.append(year).append("��").append(month).append("��").append(day).append("��").
		append(hour).append(":").append(minute).append(":").append(second).append(" ").
		append(millisecond).append(" ").append(weeks[week]);
	
		System.out.println(sb.toString());
		
	}

}
