package ���Ͽ��Set�ӿ�.set;

import java.util.HashSet;
import java.util.Set;

public class CatService 
{
	private Set<Cat> set = new HashSet<Cat>();
	
	//���
	public void add(Cat c)
	{
		set.add(c);
	}
	//�޸�
	public void update(Cat c)
	{
		Cat cat = find(c.getName());
		if(cat==null)
			return;
		cat.setAge(c.getAge());
	}
	//ɾ��
	public void delete(String name)
	{
		Cat cat = find(name);
		if(cat==null)
			return;
		set.remove(cat);
	}
	//����
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
	//��ӡ
	public void print()
	{
		System.out.println(set);
	}
}
