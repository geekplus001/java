package 自定义异常类.com.vince.homework;
/*
 * 用户登录功能业务类
 */
public class UserService
{
	public boolean login(User user)throws LogicException
	{
		if(user==null)
		{
			throw new LogicException("用户名或密码不能为空");
		}
		if("admin".equals(user.getUsername())&&"123".equals(user.getPassword()))
		{
			return true;
		}
		else
		{
			throw new LogicException("用户名或密码错误");
		}
	}

}
