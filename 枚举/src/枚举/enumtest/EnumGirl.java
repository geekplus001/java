package 枚举.enumtest;
/*
 * 四个心动女生枚举
 */
public enum EnumGirl 
{
	Girl1("梦梦"),Girl2("泉彩"),Girl3("萌萌"),Girl4("空空");
	
	private String name;
	//枚举的构造方法必须s私有
	private EnumGirl()
	{
		System.out.println("无参数构造方法");
	}
	private EnumGirl(String name)
	{
		this.name = name();
		System.out.println("带参数构造方法");
	}
}
