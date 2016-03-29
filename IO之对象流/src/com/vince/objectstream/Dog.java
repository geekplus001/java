package com.vince.objectstream;

import java.io.Serializable;
/*
 * 实现接口Serializable以启用序列化功能，标记接口，没有方法
 */
public class Dog implements Serializable
{
	private String name;
	//使用transient声明的属性图将不会被序列化
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
