package �Զ����쳣��.com.vince.homework;
/*
 * �û���¼����ҵ����
 */
public class UserService
{
	public boolean login(User user)throws LogicException
	{
		if(user==null)
		{
			throw new LogicException("�û��������벻��Ϊ��");
		}
		if("admin".equals(user.getUsername())&&"123".equals(user.getPassword()))
		{
			return true;
		}
		else
		{
			throw new LogicException("�û������������");
		}
	}

}
