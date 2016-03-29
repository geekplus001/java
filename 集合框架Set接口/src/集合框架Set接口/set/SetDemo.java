package 集合框架Set接口.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set接口
 * 1、不允许重复元素（null也是只能一个）
 * 2、输出会以插入的顺序输出
 * 3、底层是使用LinkedHashMap实现
 */
public class SetDemo 
{
	/*
	 * LinkedHashSet实现类
	 * 1、使用哈希表+双向链表实现
	 * 2、输出会以插入的顺序输出
     * 3、底层是使用LinkedHashMap实现
	 */
	public static void linkedhashset()
	{
		Set<Student> set = new LinkedHashSet<Student>();
		Student s1 = new Student("小白",18);
		Student s2 = new Student("小黑",19);
		Student s3 = new Student("小红",17);
		set.add(s3);
		set.add(s1);
		set.add(s2);
//		set.add(s1);
		set.add(new Student("小红",17));
		System.out.println(set);
	}
	
	
	
	/*
	 * TreeSet实现类
	 * 1、使用元素的自然顺序对元素进行排序
	 * 2、底层使用TreeMap实现（树型结构）
	 * 3、在TreeSet集合中存储自定义对象时候，该对象必须实现Comparator/Comparable接口
	 * 
	 */
	public static void treeSet()
	{
		Set<String> set = new TreeSet<String>();
		set.add("空空");
    	set.add("兰兰");
    	set.add("岛爱");
    	set.add("泉彩");
    	set.add("空空");
    	
    	System.out.println("元素个数是："+set.size());
    	
    	String [] names = set.toArray(new String[]{});
    	for(String s:names)
    	{
    		System.out.println(s);
    	}
    	System.out.println("------------添加自定义对象-----------");
    	Set<Emp> emps = new TreeSet<Emp>();
    	Emp e1 = new Emp("空空",30);
    	Emp e2 = new Emp("兰兰",29);
    	Emp e3 = new Emp("岛爱",32);
    	Emp e4 = new Emp("泉彩",28);
    	emps.add(e1);
    	emps.add(e2);
    	emps.add(e3);
    	emps.add(e4);
//    	emps.add(e1);
    	emps.add(new Emp("莉亚",29));
    	System.out.println("元素个数是："+emps.size());
    	
	}
	
	/*
	 * HashSet实现类，
	 * 1、不保证迭代顺序
	 * 2、底层使用HashMap实现（哈希表）
	 * 3、自定义对象是否重复的判断条件是：先判断hashCode是否相等，
	 * 如果hashCode不相等，那么一定不是同一个对象；如果hashCode相等，
	 * 那么就需要equals方法进一步判断，如果equals返回true表示是同一个对象,
	 * 如果equals返回false表示对象不是同一个
	 */
    public static void hashSet()
    {
    	Set<String> set  = new HashSet<String>();
    	set.add("空空");
    	set.add("兰兰");
    	set.add("岛爱");
    	set.add("泉彩");
    	set.add("空空");
    	
    	System.out.println("元素的个数是："+set.size());
    	
    	//把集合转换成数组
//    	Object [] obj = set.toArray();
    	String [] names = set.toArray(new String[]{});
    	for(String s:names)
    	{
    		System.out.println(s);
    	}
    	System.out.println("-----------------------");
    	
    	//--------------存储自定义对象------------------
    	Set <Person> persons = new HashSet<Person>();
    	Person p1 = new Person("空空",30);
    	Person p2 = new Person("兰兰",29);
    	Person p3 = new Person("岛爱",32);
    	Person p4 = new Person("泉彩",28);
    	persons.add(p1);
    	persons.add(p2);
    	persons.add(p3);
    	persons.add(p4);
    	persons.add(p1);
    	persons.add(new Person("空空",30));
    	System.out.println("一共有元素:"+persons.size());
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		hashSet();
//		treeSet();
		linkedhashset();
	}

}
