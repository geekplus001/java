package com.vince.stringbuffer;

public class StringBufferDemo 
{
	public static void main(String[] args)
	{
		String s = "С��";
		//Ĭ���ַ�����Ĵ�С��16
		//��չ��ʽ����ԭ���ĳ���+1��*2
		//������ǿ���ȷ���������ȣ����Ե��ô���ʼ�����Ĺ��췽��
		
		StringBuffer sb = new StringBuffer();
		sb.append("�˿̴���㽫����");
		sb.append("�˿�ѧϰ���㽫Բ�Ρ�");
		sb.append("�����ʵĹ����ӽ���Ϊδ��������");
		
		//ɾ��ָ��λ�õ��ַ�����������ʼλ�ã�����������λ��
		sb.delete(29, 32);
		System.out.println(sb.toString());
	    //��ѯָ���ַ�����һ�γ��ֵ�λ��
		int index = sb.indexOf("��");
	    System.out.println("���㡯�ֵ�λ����"+index);
	
	    //���뷽��
	    sb.insert(29, "�����");
	    System.out.println(sb);//�Զ�toSting
	    
	    //�滻����
	    sb.replace(0, 2, "����");
	    System.out.println(sb);
	    //�ַ�����ת
//	    sb.reverse();
//	    System.out.println(sb);
	    
	    //�ַ�����ȡ
	    String s1 = sb.substring(19);
	    System.out.println(s1);
	    
	    String s2 = sb.substring(19, 26);
	    System.out.println(s2);
	    
	    //StringBuilder:synchronized�ؼ��ֱ�ʾͬ��
	    //���̷߳���ʱʹ�ã�Ч�ʸ���,�̲߳���ȫ
	    //StringBuffer�����̷߳���ʱ��ʹ�ã�Ч�ʽϵͣ��̰߳�ȫ
	    StringBuilder sb2 = new StringBuilder();
	    
	}

}
