package ���Ͽ��Set�ӿ�.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set�ӿ�
 * 1���������ظ�Ԫ�أ�nullҲ��ֻ��һ����
 * 2��������Բ����˳�����
 * 3���ײ���ʹ��LinkedHashMapʵ��
 */
public class SetDemo 
{
	/*
	 * LinkedHashSetʵ����
	 * 1��ʹ�ù�ϣ��+˫������ʵ��
	 * 2��������Բ����˳�����
     * 3���ײ���ʹ��LinkedHashMapʵ��
	 */
	public static void linkedhashset()
	{
		Set<Student> set = new LinkedHashSet<Student>();
		Student s1 = new Student("С��",18);
		Student s2 = new Student("С��",19);
		Student s3 = new Student("С��",17);
		set.add(s3);
		set.add(s1);
		set.add(s2);
//		set.add(s1);
		set.add(new Student("С��",17));
		System.out.println(set);
	}
	
	
	
	/*
	 * TreeSetʵ����
	 * 1��ʹ��Ԫ�ص���Ȼ˳���Ԫ�ؽ�������
	 * 2���ײ�ʹ��TreeMapʵ�֣����ͽṹ��
	 * 3����TreeSet�����д洢�Զ������ʱ�򣬸ö������ʵ��Comparator/Comparable�ӿ�
	 * 
	 */
	public static void treeSet()
	{
		Set<String> set = new TreeSet<String>();
		set.add("�տ�");
    	set.add("����");
    	set.add("����");
    	set.add("Ȫ��");
    	set.add("�տ�");
    	
    	System.out.println("Ԫ�ظ����ǣ�"+set.size());
    	
    	String [] names = set.toArray(new String[]{});
    	for(String s:names)
    	{
    		System.out.println(s);
    	}
    	System.out.println("------------����Զ������-----------");
    	Set<Emp> emps = new TreeSet<Emp>();
    	Emp e1 = new Emp("�տ�",30);
    	Emp e2 = new Emp("����",29);
    	Emp e3 = new Emp("����",32);
    	Emp e4 = new Emp("Ȫ��",28);
    	emps.add(e1);
    	emps.add(e2);
    	emps.add(e3);
    	emps.add(e4);
//    	emps.add(e1);
    	emps.add(new Emp("����",29));
    	System.out.println("Ԫ�ظ����ǣ�"+emps.size());
    	
	}
	
	/*
	 * HashSetʵ���࣬
	 * 1������֤����˳��
	 * 2���ײ�ʹ��HashMapʵ�֣���ϣ��
	 * 3���Զ�������Ƿ��ظ����ж������ǣ����ж�hashCode�Ƿ���ȣ�
	 * ���hashCode����ȣ���ôһ������ͬһ���������hashCode��ȣ�
	 * ��ô����Ҫequals������һ���жϣ����equals����true��ʾ��ͬһ������,
	 * ���equals����false��ʾ������ͬһ��
	 */
    public static void hashSet()
    {
    	Set<String> set  = new HashSet<String>();
    	set.add("�տ�");
    	set.add("����");
    	set.add("����");
    	set.add("Ȫ��");
    	set.add("�տ�");
    	
    	System.out.println("Ԫ�صĸ����ǣ�"+set.size());
    	
    	//�Ѽ���ת��������
//    	Object [] obj = set.toArray();
    	String [] names = set.toArray(new String[]{});
    	for(String s:names)
    	{
    		System.out.println(s);
    	}
    	System.out.println("-----------------------");
    	
    	//--------------�洢�Զ������------------------
    	Set <Person> persons = new HashSet<Person>();
    	Person p1 = new Person("�տ�",30);
    	Person p2 = new Person("����",29);
    	Person p3 = new Person("����",32);
    	Person p4 = new Person("Ȫ��",28);
    	persons.add(p1);
    	persons.add(p2);
    	persons.add(p3);
    	persons.add(p4);
    	persons.add(p1);
    	persons.add(new Person("�տ�",30));
    	System.out.println("һ����Ԫ��:"+persons.size());
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		hashSet();
//		treeSet();
		linkedhashset();
	}

}
