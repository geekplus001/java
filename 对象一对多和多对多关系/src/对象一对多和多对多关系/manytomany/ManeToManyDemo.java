package ����һ�Զ�Ͷ�Զ��ϵ.manytomany;

public class ManeToManyDemo 
{

	public static void main(String[] args)
	{
		Teacher t1 = new Teacher("����ʦ",18);
		Teacher t2 = new Teacher("����ʦ",28);
		
		Student s1 =  new Student("С��",18);
		Student s2 =  new Student("С��",19);
		
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
