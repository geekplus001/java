package 注解.annotation;



public class AnnotationDemo 
{
	
	@SuppressWarnings("deprecation")
	public static void main(String [] args) throws ClassNotFoundException
	{
		
		User user = new User("XB");
		user.print();
		
		//使用反射解析注解
		Class<?> c = Class.forName("注解.annotation.User");
		//获取当前类标记的所有注解
		java.lang.annotation.Annotation[] annotations = c.getAnnotations();
		for(java.lang.annotation.Annotation a:annotations)
		{
			System.out.println(a);
			//判断是否是指定的注解
			if(c.isAnnotationPresent(MyAnnotation.class))
			{
				MyAnnotation ma = (MyAnnotation)a;
				String name = ma.name();
				System.out.println(name);
			}
		}
	}
	
}
