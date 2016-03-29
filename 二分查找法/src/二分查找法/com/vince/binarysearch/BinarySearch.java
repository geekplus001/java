package 二分查找法.com.vince.binarysearch;

import java.io.StreamTokenizer;
import java.util.Arrays;

public class BinarySearch 
{

	public static void main(String[] args)
	{
		int [] number = {4,58,11,34,88,45};
		//必须保证数列有序
		Arrays.sort(number);
		int index = binarySearch(number, 11);
		System.out.println(index);
		
	}
	private static int binarySearch(int [] x,int n)
	{
		int start = 0;
		int end = x.length-1;
		int mid = -1;
		while(start<=end)
		{
			mid = (start+end)/2;
			if(x[mid]==n)
				return mid;
			else if(x[mid]<n)
			{
				start = mid+1;
			}
			else if(x[mid]>n)
				end = mid-1;
		}
		return -1;
	}

}
