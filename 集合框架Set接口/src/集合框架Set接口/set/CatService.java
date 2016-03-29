package 集合框架Set接口.set;

import java.util.HashSet;
import java.util.Set;

public class CatService 
{
	private Set<Cat> set = new HashSet<Cat>();
	
	//添加
	public void add(Cat c)
	{
		set.add(c);
	}
	//修改
	public void update(Cat c)
	{
		Cat cat = find(c.getName());
		if(cat==null)
			return;
		cat.setAge(c.getAge());
	}
	//删除
	public void delete(String name)
	{
		Cat cat = find(name);
		if(cat==null)
			return;
		set.remove(cat);
	}
	//查找
	public Cat find(String name)
	{
		Cat[] cats =  set.toArray(new Cat[]{});
		for(Cat cat:cats)
		{
			if(cat.getName().equals(name))
			{
				return cat;
			}
		}
		return null;
	}
	//打印
	public void print()
	{
		System.out.println(set);
	}
}
