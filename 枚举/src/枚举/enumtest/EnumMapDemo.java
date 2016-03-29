package ö��.enumtest;

import java.util.EnumMap;
import java.util.Set;

public class EnumMapDemo {

	public static void main(String[] args)
	{
		EnumMap<EnumController,String> map =
				new EnumMap<EnumController,String>(EnumController.class);
		
		map.put(EnumController.ON, "��");
		map.put(EnumController.OFF, "�ر�");
		
		Set<EnumController> keySet = map.keySet();
		for(EnumController enumController:keySet)
		{
			System.out.println(enumController+"--"+map.get(enumController));
		}
	}

}
