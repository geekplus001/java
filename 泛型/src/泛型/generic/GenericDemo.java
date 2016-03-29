package 泛型.generic;

public class GenericDemo
{

	public static void main(String[] args)
	{
		Children<Integer> c1 = new Children<Integer>("小小白",3);
		Children<Float> c2 = new Children<Float>("小小黑",1.6f);
		Children<String> c3 = new Children<String>("小小黄","二");
		
		Children<String> c4 = new Children("小小花","三");
		Children c5 = new Children<String>("呵呵","三");
		
		//定义数组不能使用泛型
//		Children<String> [] cs = new Children<String>{};
		Children c6 = new Children();//表示擦除泛型，是欧阳Objec（一般避免）
		
		
		int age1 = c1.getAge();
		float age2  = c2.getAge();
		String age3 = c3.getAge();
		
		
		Children<Integer> c7 = new Children<Integer>();
		Children<String> c8 = new Children<String>();
		//错误，参数化类型不同，两个对象不能互相赋值
		//c8 =c7;
		print(c1);
		print(c2);
		
		
		
		//使用泛型上限
//		Children2<String> c9 = new Children2<Number>();
//		Children2<Integer> c10 = new Children2<Integer>();
		
		//使用泛型下限
//		fun(c3);
		
		//使用泛型方法
		String [] names = {"小白","凤凤","空空"};
		names = fun2(names,0,2);
		for(String s:names)
		{
			System.out.println(s);
		}
	}
	
	//定义泛型下限
	public static void fun(Children<? super String> c)
	{
		System.out.println(c.getAge());
	}
	
	
	
	
	//使用通配符？定义参数：只能输出不能修改
	public static void print(Children<?> c)
	{
		System.out.println("我的年龄是："+c.getAge());;
	}
	
	//定义泛型方法
	public static <T> T[] fun2(T[] array,int i,int t)
	{
		T temp = array[i];
		array[i] = array[t];
		array[t] = temp;
		return array;
	}

}
