package ���Ͽ��List�ӿ�.homework;

import java.util.ArrayList;

/*
 * �û�������
 * �ṩ���û�����ɾ�Ĳ������CRUD��create read update delete
 */
public class UserService 
{
	private ArrayList<User> users;
	
	//���췽���д�������
	public UserService()
	{
		users = new ArrayList<User>();
	}
	/*
	 * ��ӷ���
	 */
	public void add(User user)
	{
		users.add(user);
	}

	/*
	 * �޸ķ���
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
	 * ɾ������
	 */
	public void delete(String name)
	{
		User u = find(name);
		if(u==null)
			return;
		users.remove(u);
	}
	
	/*
	 * ���ҷ���
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
	 * ��������û���Ϣ
	 */
	public void print()
	{
		for(int i=0;i<users.size();i++)
		{
			System.out.println(users.get(i));
		}
	}
}
