//final �ؼ���
//1��final����һ����     ���಻�ܱ��̳�
//2��final����һ������   �÷������ܱ�������д
//3��final����һ������   ��final���ε�����Ϊ������ֵ���ܸı䣩
//(1)��������ʱ��ֵ  ��2��ͨ�����췽����ֵ
public class FinalKeyWordDemo
{
	public static void main(String[] args)
	{
		
	}
}

final class Girl
{
	final String name = "С��";//����
	final String sex;
	public Girl(String sex)
	{
		this.sex = sex;
	}
	public final void desc()
	{
		System.out.println("����"+name);
	}
}