package 集合框架Iterator接口.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	/*
	 * 使用ListIterator迭代器遍历集合
	 */
	public static void listIterator(List<String> list)
	{
		ListIterator<String> iter = list.listIterator();
		
		//从前往后遍历
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("------------------------");
		//从后往前遍历
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String> ();
		list.add("中国好声音");
		list.add("中国星跳跃");
		list.add("中国最强音");
		listIterator(list);

	}

}
