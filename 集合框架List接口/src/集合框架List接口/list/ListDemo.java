package 集合框架List接口.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List接口：
 * 1、允许重复元素
 * 2、必须是有序的
 * 3、允许null元素
 */
public class ListDemo 
{
	/*
	 * LinkedList实现类
	 * 1、使用双向链表实现
	 * 2、优点，适合插入，删除操作很方便
	 */
	public static void linkedlist()
	{
		LinkedList list = new LinkedList();
		list.add("凤凤");
		list.add("萌萌");
		list.add("琳琳");
	}
	
	
	/*
	 * Vector实现类
	 * 1、使用动态数组实现
	 * 2、默认构造方法初始化容量为10
	 * 3、扩充方式：如果有指定增量：当前容量+增量；如果没有增量：原容量*2
	 * 4、线程安全
	 */
	public static void vector()
	{
		Vector vector = new Vector();
		vector.add("纯纯");
		vector.add("梦梦");
		vector.add("爱爱");
		
	}
	
	
	
	
	//ArrayList实现类
	//1、默认构造的ArrayList对象是十个
	//2、如果数组存满，就需要动态扩充数组，算法是：（原数组长度*3/2）+1，大约是原数组的一般左右
	//3、内部使用动态数组实现
	//4、如果我们已知元素个数，我们可以使用指定初始容量的构造创建ArrayList对象，
	//这样可以有效避免数组扩充次数过多，从而提高效率
	//5、使用插入或者删除操作，会导致数组重新创建，会影响性能，尽量少用
	//6、线程不安全
	public static void arrayList()
	{
		//创建ArrayList对象
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("小白");
		list.add(true);
		//添加元素......
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(17);
		
		//插入方法
		list.add(5,50);
		
		System.out.println("一共有元素："+list.size());
		System.out.println("第五个元素是："+list.get(5));
		//清除所有元素
//		list.clear();
//		System.out.println(list.size());
		//如果列表中包含指定元素，返回true
		System.out.println(list.contains(17));
		
		//查找指定元素位置（首次）
		System.out.println(list.indexOf(17));
		//检查集合是否为空
		System.out.println(list.isEmpty());
		
		//删除指定索引的元素
		System.out.println(list.remove(12));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		arrayList();
		
		//创建集合对象时，使用泛型
		List<String> list = new ArrayList<String>();
		list.add("");
	}

}
