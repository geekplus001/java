package 集合框架Iterator接口.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {
	/*
	 * 使用Iterator迭代器遍历集合
	 */
	public static void iterator(Collection<String> c) {
		// 获取迭代器对象
		Iterator<String> iter = c.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list集合
		List<String> list = new ArrayList<String>();
		list.add("天天向上");
		list.add("康熙来了");
		list.add("非诚勿扰");
		list.add("爸爸去哪儿");
		// 输出
		iterator(list);
		System.out.println("-----------------------------");
		// set集合
		Set<String> set = new HashSet<String>();
		set.add("天天向上");
		set.add("康熙来了");
		set.add("非诚勿扰");
		set.add("爸爸去哪儿");
		iterator(set);
	}

}
