package ���Ͽ��Iterator�ӿ�.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ForeachDemo
{
	/*
	 * ʹ��foreach��������
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
		set.add("�����̸");
		set.add("���Ƶ�����");
		set.add("��������");
		foreach(set);
	}

}
