/*
jdk1.5�����ԣ���װ��
1����װ��ĸ�ֵ��ʽ
��1��ʹ��new�ؼ��ִ�������
��2��ֱ�Ӹ���װ�ำֵ
*/

public class WrapperClassDemo
{
	public static void main(String[] args)
	{
		Long x1 = new Long(100);//������װ�����

		long x2 = 100L;
		Long x3 = 100L;//ֱ�Ӹ���װ�ำֵ(�Զ�װ��)
		long x4 = x3;//����ֵ�������������ͣ��Զ����䣩
		long x5 = x3.longValue();//�ֶ�����

		//�ַ���ת�����������ͣ��ַ�������Ϊ�������ַ���
		String s1 = "12345";
		//��һ���ַ���ת��Ϊint������������
		int x6 = Integer.parseInt(s1);
		System.out.println(x6);

		Integer x7 = Integer.valueOf(s1);
		System.out.println("x7="+x7);

		System.out.println("-------------------------");
		Integer x8 = new Integer(10);
		Integer x9 = new Integer(10);

		//Integerֱ�Ӹ�ֵʱ����ֵΪ1���ֽ��ڵ���ʱ��
		//��ʹ��ͬһ������
		//Byte Short Long Integer(��Ԫ���ģʽ)����
		Integer x10 = 10;
		Integer x11 = 10;
		System.out.println(x8==x9);
		System.out.println(x8==x10);
		System.out.println(x11==x10);
	}
}