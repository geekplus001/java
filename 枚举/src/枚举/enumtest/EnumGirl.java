package ö��.enumtest;
/*
 * �ĸ��Ķ�Ů��ö��
 */
public enum EnumGirl 
{
	Girl1("����"),Girl2("Ȫ��"),Girl3("����"),Girl4("�տ�");
	
	private String name;
	//ö�ٵĹ��췽������s˽��
	private EnumGirl()
	{
		System.out.println("�޲������췽��");
	}
	private EnumGirl(String name)
	{
		this.name = name();
		System.out.println("���������췽��");
	}
}
