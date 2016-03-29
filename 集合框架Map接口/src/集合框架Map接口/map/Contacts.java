package ���Ͽ��Map�ӿ�.map;

import java.util.HashMap;
/*
 * ͨѶ¼
 */
import java.util.Map;
public class Contacts 
{
	private Map<Integer, Contact> contactMap = new HashMap<Integer, Contact>();
	private int id = 1;//���
	//�����ϵ��
	public void add(Contact c)
	{
		contactMap.put(id++, c);
	}
	//�޸���ϵ��
	public void update(int id,Contact c)
	{
		Contact contact  = find(id);
		contact.setName(c.getName());
		contact.setPhoneNumber(c.getPhoneNumber());
	}
	//������ϵ��
	public void delete(int id)
	{
		contactMap.remove(id);
	}
	//������ϵ��
	public Contact find(int id)
	{
		return contactMap.get(id);
	}
	
	//��ȡ������ϵ��
	public  Map<Integer, Contact> getContacts()
	{
		return contactMap;
	}
}
