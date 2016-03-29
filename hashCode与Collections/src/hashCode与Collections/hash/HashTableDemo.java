package hashCode与Collections.hash;

import java.util.HashSet;

/*
 * Collection（集合的一个接口）Collections(操作集合的一个类)
 */
public class HashTableDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<Person> set = new HashSet<Person>();
		Person p1 = new Person(18,"小白");
		Person p2 = new Person(19,"小黑");
		System.out.println("p1 hashCode="+p1.hashCode());
		System.out.println("p2 hashCode="+p2.hashCode());
		System.out.println("p1 的散列值="+p1.hashCode()%16);
		System.out.println("p2 的散列值="+p2.hashCode()%16);
		set.add(p1);
		set.add(p2);
		set.add(new Person(18,"小白"));
		System.out.println(set.size());
		//在修改属性后
		p1.setAge(20);
		System.out.println("p1 的散列值="+p1.hashCode()%16);
		set.remove(p1);//散列值改变删除不了(所以重写的时候可变的属性不能参加hashCode值计算)
		System.out.println(set.size());
	}

}
