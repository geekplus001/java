package ����һ�Զ�Ͷ�Զ��ϵ.onetomany;

import java.util.HashSet;
import java.util.Set;

/*
 * һ�Զ��ϵ��
 * 1������һ�Զ��ϵ
 * 2��˫��һ�Զ��ϵ
 * 
 * �ʵ�
 */
public class Emperor 
{
	private String name;
	private String title;
	
	//һ�Զ��ϵ��ʾ
	private Set<Concubine> concubines = new HashSet<Concubine>();
	
	public Set<Concubine> getConcubines() {
		return concubines;
	}
	
	
	public void setConcubines(Set<Concubine> concubines) {
		this.concubines = concubines;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Emperor [name=" + name + ", title=" + title + "]";
	}
	public Emperor(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}
	public Emperor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
