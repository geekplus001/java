package 枚举.enumtest;

import java.util.EnumMap;
import java.util.Set;

public class EnumMapDemo {

	public static void main(String[] args)
	{
		EnumMap<EnumController,String> map =
				new EnumMap<EnumController,String>(EnumController.class);
		
		map.put(EnumController.ON, "打开");
		map.put(EnumController.OFF, "关闭");
		
		Set<EnumController> keySet = map.keySet();
		for(EnumController enumController:keySet)
		{
			System.out.println(enumController+"--"+map.get(enumController));
		}
	}

}
