package com.vince.random;

import java.util.Random;

public class RandomDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//随机数
		Random r = new Random();
		int x= r.nextInt(100);//包括0不包括99
		System.out.println("x="+x);
		
	}

}
