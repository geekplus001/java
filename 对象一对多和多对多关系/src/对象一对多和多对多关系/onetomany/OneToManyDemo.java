package ����һ�Զ�Ͷ�Զ��ϵ.onetomany;

import java.util.Set;

public class OneToManyDemo
{

	public static void main(String[] args)
	{
		Emperor e  = new Emperor("����","����");
		Concubine c1 = new Concubine("��","��Ӧ");
		Concubine c2 = new Concubine("��","����");
		Concubine c3 = new Concubine("��","�ʹ���");
		
		//������ϵ
		e.getConcubines().add(c1);
		e.getConcubines().add(c2);
		e.getConcubines().add(c3);
		
		c1.setEmperor(e);
		c2.setEmperor(e);
		c3.setEmperor(e);
		
		System.out.println("�ʵۣ�"+e.getName()+"	��ţ�"+e.getTitle());
		Set<Concubine> set  = e.getConcubines();
		for(Concubine concubines:set)
		{
			System.out.println(concubines);
		}
	}

}
