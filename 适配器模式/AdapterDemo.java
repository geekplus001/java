//适配器模式

class AdapterDemo
{
	public static void main(String[] args)
	{
		PowerA powerA = new PowerAImpl();
		start(powerA);
		PowerB powerB = new PowerBImpl();
		PowerAAdapter pa = new PowerAAdapter(powerB);
		start(pa);
	}
	//开始工作
	public static void start(PowerA powerA)
	{
		powerA.insert();
	}
	/*public static void start(PowerB powerB)
	{
		powerB.connect();
	}*/
}


class PowerAAdapter implements PowerA
{
	private PowerB powerB;//要进行适配的接口

	public PowerAAdapter(PowerB powerB)
	{
		this.powerB = powerB;
	}
	public void insert()
	{
		powerB.connect();
	}
}

//电源A接口 
interface PowerA
{
	public void insert();
}
class PowerAImpl implements PowerA
{
	public void insert()
	{
		System.out.println("电源A接口插入，开始工作");
	}
}

//电源B接口
interface PowerB
{
	public void connect();
}
class PowerBImpl implements PowerB
{
	public void connect()
	{
		System.out.println("电源B接口已连接，可以开始工作");
	}
}