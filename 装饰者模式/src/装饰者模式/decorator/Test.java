package װ����ģʽ.decorator;

public class Test 
{

	public static void main(String[] args) 
	{
		//����һ������
		Drink soya = new SoyaBeanMilk();
		//�ڶ����мӼ���
		EggDecorator eggSoya  = new EggDecorator(soya);
		//�ڼ��˼����Ķ����м���
		SugarDecorator sugarEggSoya = new SugarDecorator(eggSoya);
		//�ڼ��˼������ǵĶ����мӺڶ�
		BlackBeanDecorator blackBeanSugarEggSoya =  new BlackBeanDecorator(sugarEggSoya);
		
		//����
		System.out.println("ͬ־��������ǣ�"+blackBeanSugarEggSoya.description());
		System.out.println("��һ�������ˣ�"+blackBeanSugarEggSoya.cost()+"Ԫ");
		
	}

}
