package ����һ�Զ�Ͷ�Զ��ϵ.manytomany;

import java.util.ArrayList;
import java.util.List;

/*
 * ��Զ��ϵ
 * 1������
 * 2��˫��
 */
public class Teacher 
{
	private String name;
	private int age;
	
	//��ʾ��Զ��ϵ
	private List<Student> students = new ArrayList<Student>();
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
