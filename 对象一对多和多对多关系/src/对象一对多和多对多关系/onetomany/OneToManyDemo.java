package 对象一对多和多对多关系.onetomany;

import java.util.Set;

public class OneToManyDemo
{

	public static void main(String[] args)
	{
		Emperor e  = new Emperor("威哥","威武");
		Concubine c1 = new Concubine("白","答应");
		Concubine c2 = new Concubine("丽","贵人");
		Concubine c3 = new Concubine("轩","皇贵妃");
		
		//关联关系
		e.getConcubines().add(c1);
		e.getConcubines().add(c2);
		e.getConcubines().add(c3);
		
		c1.setEmperor(e);
		c2.setEmperor(e);
		c3.setEmperor(e);
		
		System.out.println("皇帝："+e.getName()+"	年号："+e.getTitle());
		Set<Concubine> set  = e.getConcubines();
		for(Concubine concubines:set)
		{
			System.out.println(concubines);
		}
	}

}
