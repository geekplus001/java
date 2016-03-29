package 集合框架Iterator接口.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ForeachDemo
{
	/*
	 * 使用foreach迭代集合
	 */
	public static void foreach(Collection<String> c)
	{
		for(String s:c)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String> ();
		set.add("焦点访谈");
		set.add("金牌调解室");
		set.add("威哥来了");
		foreach(set);
	}

}
