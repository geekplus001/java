package 枚举.enumtest;
/*
 * 枚举实现接口
 */
public enum EnumColor implements Info
{
	RED
	{
		public String getColor()
		{
			return "红色";
		}
	},
	BLUE
	{
		public String getColor()
		{
			return "蓝色";
		}
	},
	GREEN
	{
		public String getColor()
		{
			return "绿色";
		}
	};
}


interface Info
{
	public String getColor();
}
