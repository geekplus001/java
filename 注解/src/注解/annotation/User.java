package ע��.annotation;

//ʹ���Զ���ע��
@MyAnnotation(name="XB",like={"���","˯��"},sex=EnumSex.GG)
public class User 
{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(@MyAnnotation(name="XB",like={"���","˯��"},sex=EnumSex.GG)String name) {
		this.name = name;
	}
	public User(String name)
	{
		this.name = name;
	}
	@Override//ֻ�ܸ��Ǹ��������еķ���
	public String toString() {
		return "my name is:"+name;
	}
	@Deprecated//���Ϊ�ѹ�ʱ
	public void print()
	{
		System.out.println("name="+name);
	}
}
