package ���Ͽ��List�ӿ�.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List�ӿڣ�
 * 1�������ظ�Ԫ��
 * 2�������������
 * 3������nullԪ��
 */
public class ListDemo 
{
	/*
	 * LinkedListʵ����
	 * 1��ʹ��˫������ʵ��
	 * 2���ŵ㣬�ʺϲ��룬ɾ�������ܷ���
	 */
	public static void linkedlist()
	{
		LinkedList list = new LinkedList();
		list.add("���");
		list.add("����");
		list.add("����");
	}
	
	
	/*
	 * Vectorʵ����
	 * 1��ʹ�ö�̬����ʵ��
	 * 2��Ĭ�Ϲ��췽����ʼ������Ϊ10
	 * 3�����䷽ʽ�������ָ����������ǰ����+���������û��������ԭ����*2
	 * 4���̰߳�ȫ
	 */
	public static void vector()
	{
		Vector vector = new Vector();
		vector.add("����");
		vector.add("����");
		vector.add("����");
		
	}
	
	
	
	
	//ArrayListʵ����
	//1��Ĭ�Ϲ����ArrayList������ʮ��
	//2������������������Ҫ��̬�������飬�㷨�ǣ���ԭ���鳤��*3/2��+1����Լ��ԭ�����һ������
	//3���ڲ�ʹ�ö�̬����ʵ��
	//4�����������֪Ԫ�ظ��������ǿ���ʹ��ָ����ʼ�����Ĺ��촴��ArrayList����
	//����������Ч������������������࣬�Ӷ����Ч��
	//5��ʹ�ò������ɾ���������ᵼ���������´�������Ӱ�����ܣ���������
	//6���̲߳���ȫ
	public static void arrayList()
	{
		//����ArrayList����
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("С��");
		list.add(true);
		//���Ԫ��......
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(17);
		
		//���뷽��
		list.add(5,50);
		
		System.out.println("һ����Ԫ�أ�"+list.size());
		System.out.println("�����Ԫ���ǣ�"+list.get(5));
		//�������Ԫ��
//		list.clear();
//		System.out.println(list.size());
		//����б��а���ָ��Ԫ�أ�����true
		System.out.println(list.contains(17));
		
		//����ָ��Ԫ��λ�ã��״Σ�
		System.out.println(list.indexOf(17));
		//��鼯���Ƿ�Ϊ��
		System.out.println(list.isEmpty());
		
		//ɾ��ָ��������Ԫ��
		System.out.println(list.remove(12));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		arrayList();
		
		//�������϶���ʱ��ʹ�÷���
		List<String> list = new ArrayList<String>();
		list.add("");
	}

}
