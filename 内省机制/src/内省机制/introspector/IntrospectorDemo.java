package 内省机制.introspector;

import java.beans.IntrospectionException;

public class IntrospectorDemo 
{

	public static void main(String[] args) 
	{
		Dog dog;
		try {
			dog = DogFactory.getDog("dog");
			System.out.println(dog);
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
