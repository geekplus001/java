package com.vince.stringbuffer;

public class StringBufferDemo 
{
	public static void main(String[] args)
	{
		String s = "小白";
		//默认字符数组的大小是16
		//扩展方式：（原来的长度+1）*2
		//如果我们可以确定整个长度，可以调用带初始容量的构造方法
		
		StringBuffer sb = new StringBuffer();
		sb.append("此刻打盹，你将做梦");
		sb.append("此刻学习，你将圆梦。");
		sb.append("现在淌的哈喇子将成为未来的眼泪");
		
		//删除指定位置的字符串，包含开始位置，不包含结束位置
		sb.delete(29, 32);
		System.out.println(sb.toString());
	    //查询指定字符串第一次出现的位置
		int index = sb.indexOf("你");
	    System.out.println("‘你’字的位置是"+index);
	
	    //插入方法
	    sb.insert(29, "明天的");
	    System.out.println(sb);//自动toSting
	    
	    //替换方法
	    sb.replace(0, 2, "现在");
	    System.out.println(sb);
	    //字符串反转
//	    sb.reverse();
//	    System.out.println(sb);
	    
	    //字符串截取
	    String s1 = sb.substring(19);
	    System.out.println(s1);
	    
	    String s2 = sb.substring(19, 26);
	    System.out.println(s2);
	    
	    //StringBuilder:synchronized关键字表示同步
	    //单线程访问时使用，效率更高,线程不安全
	    //StringBuffer：多线程访问时候使用，效率较低，线程安全
	    StringBuilder sb2 = new StringBuilder();
	    
	}

}
