package Ã¶¾Ù.enumtest;

import java.util.EnumSet;

public class EnumSetDemo {

	public static void main(String[] args) 
	{
		EnumSet<EnumController> set = EnumSet.allOf(EnumController.class);
		for(EnumController enumController:set)
		{
			System.out.println(enumController);
		}
	}

}
