package ö��.enumtest;
/*
 * ö��ʵ�ֽӿ�
 */
public enum EnumColor implements Info
{
	RED
	{
		public String getColor()
		{
			return "��ɫ";
		}
	},
	BLUE
	{
		public String getColor()
		{
			return "��ɫ";
		}
	},
	GREEN
	{
		public String getColor()
		{
			return "��ɫ";
		}
	};
}


interface Info
{
	public String getColor();
}
