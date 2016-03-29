/**
	设计一个学生类，学生有三项成绩：
	计算机成绩、体育成绩、音乐成绩。
	可以求出成绩的总分、平均分、最高、最低分，并且可以输出学生全部信息。
*/
public class StudentDemo
{
	public static void main(String[] args)
	{
		Student s = new Student("小白",80f,95.6f,70f);
		System.out.println(s.show());
		System.out.println(s.getName()+"的总成绩为："+s.sum());
		System.out.println(s.getName()+"的平均成绩为："+s.avg());
		System.out.println(s.getName()+"的最高成绩为："+s.topScore());
		System.out.println(s.getName()+"的最低成绩为:"+s.lowScore());
	}
}

/**
	学生类
*/
class Student
{
	private String name;
	private float computer;
	private float sports;
	private float music;
	
	//getter/setter方法，其他属性省略
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Student(){}//默认构造方法一般保留
	
	public Student(String name,float computer,float sports,float music)
	{
		this.name = name;
		this.computer = computer;
		this.sports = sports;
		this.music = music;
	}
	
	public float sum()
	{
		float sum = computer+sports+music;
		return sum;
	}

	public float avg()
	{
		float avg = sum()/3;
		return avg;
	}

	public float topScore()
	{
		float max = computer>=sports?computer:sports;
		max = max>=music?max:music;
		return max;
	}

	public float lowScore()
	{
		float min = computer<=sports?computer:sports;
		min = min<=music?min:music;
		return min;
	}

	public String show()
	{
		return "我是"+name+"计算机成绩是："+computer+"，体育成绩是："+sports+"音乐成绩是："+music;
	}
}

