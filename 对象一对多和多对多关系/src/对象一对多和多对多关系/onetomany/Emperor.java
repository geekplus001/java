package 对象一对多和多对多关系.onetomany;

import java.util.HashSet;
import java.util.Set;

/*
 * 一对多关系：
 * 1、单向一对多关系
 * 2、双向一对多关系
 * 
 * 皇帝
 */
public class Emperor 
{
	private String name;
	private String title;
	
	//一对多关系表示
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
