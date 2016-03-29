package 集合框架Map接口.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 *Map接口
 *1、使用键值对的方式存储数据
 *
 */
public class MapDemo 
{
	/*
	 * Map接口的输出方式
	 * 1、使用map.keySet（）方法把所有的key对象
	 * 以Set集合方式，然后迭代set集合去除每个key，
	 * 再通过key从map中去value
	 * 2、使用map.values方法把所有的value对象
	 * 转换成Collection集合，然后进行迭代
	 * 3、使用map.entrySet（）方法把所有的Entry对象
	 * 转换成Set集合，然后进行迭代
	 */
	public static void print()
	{
		Map<Integer,String> map  = new HashMap<Integer,String>();
		map.put(1, "白老师");
		map.put(2, "苍老师");
		map.put(3, "武老师");
		
		
		System.out.println(map.get(2));
		System.out.println("size="+map.size());
		System.out.println("containsKey="+map.containsKey(5));
		System.out.println("containsValue="+map.containsValue("武老师"));
		
		//方式二：
		Collection<String> c = map.values();
		Iterator<String> iter = c.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("-----------------------");
		//方式三：
		Set<Entry<Integer, String>> entrys = map.entrySet();
		Iterator<Entry<Integer, String>> iter2 =  entrys.iterator();
		while(iter2.hasNext())
		{
			Entry<Integer, String> entry = iter2.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
 		}
	}
		
	/*
	 * LinkedHashMap实现类
	 * 1、Map接口的哈希表和链表列表实现，具有可预知的迭代顺序
	 */
	public static void linkedhashmap()
	{
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1, "黑老师");
		map.put(2, "泷老师");
		System.out.println("size="+map.size());
	}
	/*
	 * TreeMap实现类
	 * 1、使用二叉树中的红黑树实现
	 * 2、以key对象的自然顺序构造映射
	 * 3、使用自定义的对象作为key值时，该对象到类必须实现Comparable/Comparator
	 * 接口比较规则
	 */
	public static void treemap()
	{
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "黑老师");
		map.put(2, "泷老师");
		System.out.println("size="+map.size());
		
		Map<Person,String> map2 = new TreeMap<Person,String>();
		map2.put(new Person(20,"黑老师"),"黑老师");
		map2.put(new Person(22,"泷老师"),"泷老师");
		System.out.println("size="+map2.size());
	}
	/*
	 * HashTable实现类
	 * 1、不允许键值为null
	 * 2、默认初始容量11，加载因0.75
	 * 3、线程安全的，同步
	 */
	public static void hashtable()
	{
		Hashtable<String, String> table = new Hashtable<String,String>();
		table.put("1", "白老师");
		table.put("2", "苍老师");
	}
	/*
	 * HashMap实现类
	 * 1、使用哈希表+链表实现
	 * 2、通过Key对象的hashCode方法模拟哈希表数组长度求出散列值，
	 *根据散列值得出对象在哈希表中的存储位置，相同位置上的多个对
	 *象以链表方式存储
	 *3、当哈希表需要重新散列，会影响性能
	 *4、每次重新散列的方式：元数组长度*2
	 *5、创建HashMap默认的哈希表的大小是16，默认的加载因子是0.75
	 *6、线程不安全，不同步
	 */
	public static void hashmap()
	{
		//创建一个HashMap对象
		Map<Integer,String> map  = new HashMap<Integer,String>();
		map.put(1, "白老师");
		map.put(2, "苍老师");
		map.put(3, "武老师");
		
		
		System.out.println(map.get(2));
		System.out.println("size="+map.size());
		System.out.println("containsKey="+map.containsKey(5));
		System.out.println("containsValue="+map.containsValue("武老师"));
		//通过获取map中所有key对象的set
		Set<Integer>keyset = map.keySet();
		Iterator<Integer> iter = keyset.iterator();
		while(iter.hasNext())
		{
			Integer key = iter.next();
			String value = map.get(key);
			System.out.println("key="+key+":value="+value);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		hashmap();
//		 treemap();
//		linkedhashmap();
		print();
	}

}
