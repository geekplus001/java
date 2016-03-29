package ע��.annotation;



public class AnnotationDemo 
{
	
	@SuppressWarnings("deprecation")
	public static void main(String [] args) throws ClassNotFoundException
	{
		
		User user = new User("XB");
		user.print();
		
		//ʹ�÷������ע��
		Class<?> c = Class.forName("ע��.annotation.User");
		//��ȡ��ǰ���ǵ�����ע��
		java.lang.annotation.Annotation[] annotations = c.getAnnotations();
		for(java.lang.annotation.Annotation a:annotations)
		{
			System.out.println(a);
			//�ж��Ƿ���ָ����ע��
			if(c.isAnnotationPresent(MyAnnotation.class))
			{
				MyAnnotation ma = (MyAnnotation)a;
				String name = ma.name();
				System.out.println(name);
			}
		}
	}
	
}
