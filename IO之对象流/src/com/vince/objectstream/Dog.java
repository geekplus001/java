package com.vince.objectstream;

import java.io.Serializable;
/*
 * ʵ�ֽӿ�Serializable���������л����ܣ���ǽӿڣ�û�з���
 */
public class Dog implements Serializable
{
	private String name;
	//ʹ��transient����������ͼ�����ᱻ���л�
	private transient int age;
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
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
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
