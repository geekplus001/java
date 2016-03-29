package com.vince.arrays;

import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		String [] names1 = {"利亚","泉彩","岛爱","滕兰","结衣","井空"};
		String [] names2 = {"利亚","泉彩","岛爱","滕兰","结衣","井空"};
		//比较两个数组的内容是否相同
		boolean b = Arrays.equals(names1,names2);
		System.out.println(b);
		
		String [] names3 = new String[6];
		//填充
		Arrays.fill(names3, "井空");
		for(String s:names3)
		{
			System.out.println(s);
		}
		//排序
		int [] number = {3,2,4,6,5,1};
		Arrays.sort(number);
		for(int n:number)
			System.out.println(n);
		Arrays.sort(names1);
		//输出数组
		String s = Arrays.toString(names1);
		System.out.println(s);
		//复制指定范围
		String [] strs = Arrays.copyOfRange(names1, 0, 3);
		System.out.println(Arrays.toString(strs));
	
		//二分查找(要求数组有序)返回的是该数在数组中的位置下标
		int index = Arrays.binarySearch(number, 3);
		System.out.println(index);
	}

}
