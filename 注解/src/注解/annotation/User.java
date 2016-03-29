package 注解.annotation;

//使用自定义注解
@MyAnnotation(name="XB",like={"泡妞","睡觉"},sex=EnumSex.GG)
public class User 
{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(@MyAnnotation(name="XB",like={"泡妞","睡觉"},sex=EnumSex.GG)String name) {
		this.name = name;
	}
	public User(String name)
	{
		this.name = name;
	}
	@Override//只能覆盖父类中已有的方法
	public String toString() {
		return "my name is:"+name;
	}
	@Deprecated//标记为已过时
	public void print()
	{
		System.out.println("name="+name);
	}
}
