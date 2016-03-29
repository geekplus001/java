package 对象一对多和多对多关系.onetomany;
/*
 * 妾
 */
public class Concubine 
{
	private String name;
	private String job;
	
	//多对一关系表示
	private Emperor emperor;
	public Emperor getEmperor() {
		return emperor;
	}
	public void setEmperor(Emperor emperor) {
		this.emperor = emperor;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Concubine [name=" + name + ", job=" + job + "]";
	}
	public Concubine(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public Concubine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
