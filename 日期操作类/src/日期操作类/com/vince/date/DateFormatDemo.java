package ���ڲ�����.com.vince.date;

import java.text.DateFormat;
import java.text.Format;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		DateFormat df = DateFormat.getDateInstance();
		//������ָ�����ָ�����Ի�����
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA );
	
		DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG);
		String nowDate = df.format(new Date());
		System.out.println("��ǰ����Ϊ��"+nowDate);
		
	}

}
