package ���Ͽ��Map�ӿ�.map;

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
 *Map�ӿ�
 *1��ʹ�ü�ֵ�Եķ�ʽ�洢����
 *
 */
public class MapDemo 
{
	/*
	 * Map�ӿڵ������ʽ
	 * 1��ʹ��map.keySet�������������е�key����
	 * ��Set���Ϸ�ʽ��Ȼ�����set����ȥ��ÿ��key��
	 * ��ͨ��key��map��ȥvalue
	 * 2��ʹ��map.values���������е�value����
	 * ת����Collection���ϣ�Ȼ����е���
	 * 3��ʹ��map.entrySet�������������е�Entry����
	 * ת����Set���ϣ�Ȼ����е���
	 */
	public static void print()
	{
		Map<Integer,String> map  = new HashMap<Integer,String>();
		map.put(1, "����ʦ");
		map.put(2, "����ʦ");
		map.put(3, "����ʦ");
		
		
		System.out.println(map.get(2));
		System.out.println("size="+map.size());
		System.out.println("containsKey="+map.containsKey(5));
		System.out.println("containsValue="+map.containsValue("����ʦ"));
		
		//��ʽ����
		Collection<String> c = map.values();
		Iterator<String> iter = c.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("-----------------------");
		//��ʽ����
		Set<Entry<Integer, String>> entrys = map.entrySet();
		Iterator<Entry<Integer, String>> iter2 =  entrys.iterator();
		while(iter2.hasNext())
		{
			Entry<Integer, String> entry = iter2.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
 		}
	}
		
	/*
	 * LinkedHashMapʵ����
	 * 1��Map�ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
	 */
	public static void linkedhashmap()
	{
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1, "����ʦ");
		map.put(2, "����ʦ");
		System.out.println("size="+map.size());
	}
	/*
	 * TreeMapʵ����
	 * 1��ʹ�ö������еĺ����ʵ��
	 * 2����key�������Ȼ˳����ӳ��
	 * 3��ʹ���Զ���Ķ�����Ϊkeyֵʱ���ö��������ʵ��Comparable/Comparator
	 * �ӿڱȽϹ���
	 */
	public static void treemap()
	{
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "����ʦ");
		map.put(2, "����ʦ");
		System.out.println("size="+map.size());
		
		Map<Person,String> map2 = new TreeMap<Person,String>();
		map2.put(new Person(20,"����ʦ"),"����ʦ");
		map2.put(new Person(22,"����ʦ"),"����ʦ");
		System.out.println("size="+map2.size());
	}
	/*
	 * HashTableʵ����
	 * 1���������ֵΪnull
	 * 2��Ĭ�ϳ�ʼ����11��������0.75
	 * 3���̰߳�ȫ�ģ�ͬ��
	 */
	public static void hashtable()
	{
		Hashtable<String, String> table = new Hashtable<String,String>();
		table.put("1", "����ʦ");
		table.put("2", "����ʦ");
	}
	/*
	 * HashMapʵ����
	 * 1��ʹ�ù�ϣ��+����ʵ��
	 * 2��ͨ��Key�����hashCode����ģ���ϣ�����鳤�����ɢ��ֵ��
	 *����ɢ��ֵ�ó������ڹ�ϣ���еĴ洢λ�ã���ͬλ���ϵĶ����
	 *��������ʽ�洢
	 *3������ϣ����Ҫ����ɢ�У���Ӱ������
	 *4��ÿ������ɢ�еķ�ʽ��Ԫ���鳤��*2
	 *5������HashMapĬ�ϵĹ�ϣ��Ĵ�С��16��Ĭ�ϵļ���������0.75
	 *6���̲߳���ȫ����ͬ��
	 */
	public static void hashmap()
	{
		//����һ��HashMap����
		Map<Integer,String> map  = new HashMap<Integer,String>();
		map.put(1, "����ʦ");
		map.put(2, "����ʦ");
		map.put(3, "����ʦ");
		
		
		System.out.println(map.get(2));
		System.out.println("size="+map.size());
		System.out.println("containsKey="+map.containsKey(5));
		System.out.println("containsValue="+map.containsValue("����ʦ"));
		//ͨ����ȡmap������key�����set
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
