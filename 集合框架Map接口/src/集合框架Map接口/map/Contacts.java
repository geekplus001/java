package 集合框架Map接口.map;

import java.util.HashMap;
/*
 * 通讯录
 */
import java.util.Map;
public class Contacts 
{
	private Map<Integer, Contact> contactMap = new HashMap<Integer, Contact>();
	private int id = 1;//编号
	//添加联系人
	public void add(Contact c)
	{
		contactMap.put(id++, c);
	}
	//修改联系人
	public void update(int id,Contact c)
	{
		Contact contact  = find(id);
		contact.setName(c.getName());
		contact.setPhoneNumber(c.getPhoneNumber());
	}
	//产出联系人
	public void delete(int id)
	{
		contactMap.remove(id);
	}
	//查找联系人
	public Contact find(int id)
	{
		return contactMap.get(id);
	}
	
	//获取所有联系人
	public  Map<Integer, Contact> getContacts()
	{
		return contactMap;
	}
}
