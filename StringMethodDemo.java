/**
	String类字符与字符串的操作方法
*/
public class StringMethodDemo
{
	public static void main(String [] args)
	{
		String s = "lampbrother-小白";
		char c = s.charAt(3);
		System.out.println("charAt:"+c);
		
		char[] cs = s.toCharArray();
		for(int i=0;i<cs.length;i++)
		{
			System.out.println(cs[i]+",");
		}
	}
}