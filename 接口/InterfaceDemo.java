//�ӿ�
//�ӿڿ��Լ̳ж���ӿ�
//һ�������ʵ�ֶ���ӿ�
//������ʵ�ֽӿڿ��Բ�ʵ�ַ���
//�ӿ��е����з����ķ���Ȩ�޶���public
//�ӿ��ж�������Զ��ǳ���
//�ӿڲ��ܱ�ʵ����
public class InterfaceDemo
{
	public static void main(String[] ags)
	{
		
	}
}

interface A
{

}

interface B
{

}
//��ʳ�ӿ�
interface IEat
{
	public void eat();	
}

//����һ���ӿ�
interface Hit extends A,B
{
	public static final String NAME = "С��";
	//��������ͨ��ȫ��д~~
	//public static final ������ʡ��
	public abstract void cry();
	//���󷽷���public abstract����ʡ�ԣ�Ĭ��public
}

//Ů��
class Goddess implements Hit,IEat
{
	//ʵ��һ���ӿڱ���ʵ�ֽӿ��е����з���
	public void cry()
	{
		System.out.println("��Ӵ�ҵ���ѽ������������");
	}
	public void eat()
	{
		System.out.println("һС��һС�ڵĳ�");
	}
}


//Ů����
class Girl implements Hit
{
	public void cry()
	{
		//name = "С��";
		System.out.println("���ð����㲻֪���۰�");
	}
}

//������
abstract class Person implements Hit
{
	
}
