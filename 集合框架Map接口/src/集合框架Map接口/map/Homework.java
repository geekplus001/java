package ���Ͽ��Map�ӿ�.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Homework {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Contacts cs = new Contacts();
		System.out.println("----------�����ϵ��-----------");
		cs.add(new Contact("�տ�","138****5438"));
		cs.add(new Contact("����","130****7521"));
		cs.add(new Contact("Ȫ��","186****8654"));
		
		Map<Integer, Contact> maps = cs.getContacts();
		Set<Integer> keyset = maps.keySet();
		Iterator<Integer> iters = keyset.iterator();
		while(iters.hasNext())
		{
			Integer key  = iters.next();
			System.out.println("id:"+key+"--"+maps.get(key));
		}
		System.out.println("-----------�޸���ϵ��------------");
		cs.update(2, new Contact("����","135****8866"));
		Map<Integer, Contact> maps2 = cs.getContacts();
		Set<Integer> keyset2 = maps.keySet();
		Iterator<Integer> iters2 = keyset.iterator();
		while(iters2.hasNext())
		{
			Integer key  = iters2.next();
			System.out.println("id:"+key+"--"+maps2.get(key));
		}
		System.out.println("-------------ɾ����ϵ��------------");
		cs.delete(2);
		Map<Integer, Contact> maps3 = cs.getContacts();
		Set<Integer> keyset3 = maps.keySet();
		Iterator<Integer> iters3 = keyset.iterator();
		while(iters3.hasNext())
		{
			Integer key  = iters3.next();
			System.out.println("id:"+key+"--"+maps3.get(key));
		}
		
		System.out.println("--------������ϵ��---------");
		Contact c  = cs.find(1);
		System.out.println(c);
	}

}
