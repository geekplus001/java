package ���Ͽ��Iterator�ӿ�.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	/*
	 * ʹ��ListIterator��������������
	 */
	public static void listIterator(List<String> list)
	{
		ListIterator<String> iter = list.listIterator();
		
		//��ǰ�������
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("------------------------");
		//�Ӻ���ǰ����
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String> ();
		list.add("�й�������");
		list.add("�й�����Ծ");
		list.add("�й���ǿ��");
		listIterator(list);

	}

}
