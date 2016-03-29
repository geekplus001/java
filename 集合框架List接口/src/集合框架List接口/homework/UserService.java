package 集合框架List接口.homework;

import java.util.ArrayList;

/*
 * 用户管理类
 * 提供对用户的增删改查操作（CRUD）create read update delete
 */
public class UserService 
{
	private ArrayList<User> users;
	
	//构造方法中创建容器
	public UserService()
	{
		users = new ArrayList<User>();
	}
	/*
	 * 添加方法
	 */
	public void add(User user)
	{
		users.add(user);
	}

	/*
	 * 修改方法
	 */
	public void update(User user)
	{
		User u = find(user.getName());
		if(u==null)
			return;
		u.setAge(user.getAge());
		u.setSex(user.getSex());
	}
	
	/*
	 * 删除方法
	 */
	public void delete(String name)
	{
		User u = find(name);
		if(u==null)
			return;
		users.remove(u);
	}
	
	/*
	 * 查找方法
	 */
	public User find(String name)
	{
		for(int i=0;i<users.size();i++)
		{
			User u = users.get(i);
			if(u.getName().equals(name))
				return u;
		
		}
		return null;
	}
	
	/*
	 * 输出所有用户信息
	 */
	public void print()
	{
		for(int i=0;i<users.size();i++)
		{
			System.out.println(users.get(i));
		}
	}
}
