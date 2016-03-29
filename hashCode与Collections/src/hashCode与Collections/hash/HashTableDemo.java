package hashCode��Collections.hash;

import java.util.HashSet;

/*
 * Collection�����ϵ�һ���ӿڣ�Collections(�������ϵ�һ����)
 */
public class HashTableDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<Person> set = new HashSet<Person>();
		Person p1 = new Person(18,"С��");
		Person p2 = new Person(19,"С��");
		System.out.println("p1 hashCode="+p1.hashCode());
		System.out.println("p2 hashCode="+p2.hashCode());
		System.out.println("p1 ��ɢ��ֵ="+p1.hashCode()%16);
		System.out.println("p2 ��ɢ��ֵ="+p2.hashCode()%16);
		set.add(p1);
		set.add(p2);
		set.add(new Person(18,"С��"));
		System.out.println(set.size());
		//���޸����Ժ�
		p1.setAge(20);
		System.out.println("p1 ��ɢ��ֵ="+p1.hashCode()%16);
		set.remove(p1);//ɢ��ֵ�ı�ɾ������(������д��ʱ��ɱ�����Բ��ܲμ�hashCodeֵ����)
		System.out.println(set.size());
	}

}
