package ���Ͽ��Iterator�ӿ�.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {
	/*
	 * ʹ��Iterator��������������
	 */
	public static void iterator(Collection<String> c) {
		// ��ȡ����������
		Iterator<String> iter = c.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list����
		List<String> list = new ArrayList<String>();
		list.add("��������");
		list.add("��������");
		list.add("�ǳ�����");
		list.add("�ְ�ȥ�Ķ�");
		// ���
		iterator(list);
		System.out.println("-----------------------------");
		// set����
		Set<String> set = new HashSet<String>();
		set.add("��������");
		set.add("��������");
		set.add("�ǳ�����");
		set.add("�ְ�ȥ�Ķ�");
		iterator(set);
	}

}
