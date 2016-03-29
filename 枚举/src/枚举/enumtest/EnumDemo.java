package Ã¶¾Ù.enumtest;

public class EnumDemo
{

	public static void main(String[] args)
	{
		Controller on = Controller.ON;
		System.out.println(on);
		Controller off = on.downAction();
		System.out.println(off);
		
		System.out.println("--------------------");
		EnumController ecON = EnumController.ON;
		System.out.println(ecON);
		System.out.println(ecON.name());
		System.out.println(ecON.ordinal());
		
		//±éÀúÃ¶¾Ù
		EnumController [] es = ecON.values();
		for(int i=0;i<es.length;i++)
		{
			System.out.println(es[i]);
		}
		
		EnumController ecOff = EnumController.valueOf("OFF");
		System.out.println(ecOff);
		
		
		System.out.println("-------------------------");
		EnumGirl eg1 = EnumGirl.Girl1;
		
		System.out.println("-------------------------");
		System.out.println(EnumColor.RED.getColor());
		
		System.out.println("-------------------------");
		System.out.println(EnumController2.ON.downAction());
	}

}
