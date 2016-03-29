package ������ʽ.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) 
	{
		//���ı�㣬Ӣ�ı��
		String info = "С���Ǹ����߶˴����ϵ���,�͵��ݻ����ں�����";		
		Pattern p = Pattern.compile("\\p{Punct}");
		String [] str = p.split(info);
		for(String s:str)
		{
			System.out.println(s);
		}
		
		String email = "xiaobai@qq.com";
		Pattern p2 = Pattern.compile("\\w+@\\w+.[a-zA-Z]+");
		Matcher m = p2.matcher(email);
		if(m.matches())
		{
			System.out.println("ƥ��");
		}
		else
		{
			System.out.println("��ƥ��");
		}
		
		String date = "2013/11/05";
		Pattern p3 = Pattern.compile("/");
		Matcher m2 = p3.matcher(date);
		String s2 = m2.replaceAll("-");
		System.out.println(s2);
	}

}
