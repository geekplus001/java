package 对象一对多和多对多关系.manytomany;

public class ManeToManyDemo 
{

	public static void main(String[] args)
	{
		Teacher t1 = new Teacher("白老师",18);
		Teacher t2 = new Teacher("苍老师",28);
		
		Student s1 =  new Student("小白",18);
		Student s2 =  new Student("小黑",19);
		
		t1.getStudents().add(s1);
		t1.getStudents().add(s2);
		
		t2.getStudents().add(s1);
		t2.getStudents().add(s2);
		
		s1.getTeachers().add(t1);
		s1.getTeachers().add(t2);

		s2.getTeachers().add(t1);
		s2.getTeachers().add(t2);
	}

}
