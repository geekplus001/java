package 正则表达式.regex;

public class RegexDemo {

	public static void main(String[] args) 
	{
		String s = "0487561";
		char [] cs = s.toCharArray();
		boolean flag = true;
		for(int i=0;i<cs.length;i++)
		{
			if(!('0'<=cs[i] && cs[i]<='9'))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("字符串是由数字组成");
		}
		else
		{
			System.out.println("字符串不是由数字组成");
		}
		
		//使用正则表达式进行验证
		if(s.matches("\\d+"))
		{
			System.out.println("字符串是由数字组成");
		}
		else
		{
			System.out.println("字符串不是由数字组成");
		}
		
	}

}
