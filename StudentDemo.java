/**
	���һ��ѧ���࣬ѧ��������ɼ���
	������ɼ��������ɼ������ֳɼ���
	��������ɼ����ܷ֡�ƽ���֡���ߡ���ͷ֣����ҿ������ѧ��ȫ����Ϣ��
*/
public class StudentDemo
{
	public static void main(String[] args)
	{
		Student s = new Student("С��",80f,95.6f,70f);
		System.out.println(s.show());
		System.out.println(s.getName()+"���ܳɼ�Ϊ��"+s.sum());
		System.out.println(s.getName()+"��ƽ���ɼ�Ϊ��"+s.avg());
		System.out.println(s.getName()+"����߳ɼ�Ϊ��"+s.topScore());
		System.out.println(s.getName()+"����ͳɼ�Ϊ:"+s.lowScore());
	}
}

/**
	ѧ����
*/
class Student
{
	private String name;
	private float computer;
	private float sports;
	private float music;
	
	//getter/setter��������������ʡ��
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Student(){}//Ĭ�Ϲ��췽��һ�㱣��
	
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
		return "����"+name+"������ɼ��ǣ�"+computer+"�������ɼ��ǣ�"+sports+"���ֳɼ��ǣ�"+music;
	}
}

