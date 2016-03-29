package com.vince.arrays;

import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		String [] names1 = {"����","Ȫ��","����","����","����","����"};
		String [] names2 = {"����","Ȫ��","����","����","����","����"};
		//�Ƚ���������������Ƿ���ͬ
		boolean b = Arrays.equals(names1,names2);
		System.out.println(b);
		
		String [] names3 = new String[6];
		//���
		Arrays.fill(names3, "����");
		for(String s:names3)
		{
			System.out.println(s);
		}
		//����
		int [] number = {3,2,4,6,5,1};
		Arrays.sort(number);
		for(int n:number)
			System.out.println(n);
		Arrays.sort(names1);
		//�������
		String s = Arrays.toString(names1);
		System.out.println(s);
		//����ָ����Χ
		String [] strs = Arrays.copyOfRange(names1, 0, 3);
		System.out.println(Arrays.toString(strs));
	
		//���ֲ���(Ҫ����������)���ص��Ǹ����������е�λ���±�
		int index = Arrays.binarySearch(number, 3);
		System.out.println(index);
	}

}
