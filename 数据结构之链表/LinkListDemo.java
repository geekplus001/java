//�������ݽṹ
public class LinkListDemo
{
	public static void main(String[] args)
	{
		NodeManager nm = new NodeManager();
		nm.addNode("���1");
		nm.addNode("���2");
		nm.addNode("���3");
		nm.addNode("���4");
		nm.addNode("���5");
		nm.printNode();
		nm.delNode("���3");
		nm.printNode();
	}
}

//���������
class NodeManager
{
	private Node root;//���ڵ�
	//��ӽ��
	public void addNode(String name)
	{
		//������ڵ�Ϊ�գ���ô��ӵľ��Ǹ��ڵ�
		if(root==null)
		{
			root = new Node(name);
		}
		else
		{
			root.add(name);
		}
	}
	//ɾ�����
	public void delNode(String name)
	{
		if(root!=null)
		{
			if(root.name.equals(name))
			{
				root = root.next;
			}
			else
			{
				root.del(name);
			}
		}
	}
	//������н��
	public void printNode()
	{
		if(root!=null)
		{
			System.out.print(root.name);
			root.print();
			System.out.println();
		}
		
	}

	//����һ������ڲ���
	class Node
	{
		private String name;//�������
		private Node next;//��ʾ��һ��������
		private Node(String name)
		{
			this.name = name;
		}
		//��ӽ��
		public void add(String name)
		{
			if(this.next==null)
			{
				this.next = new Node(name);
			}
			else
			{
				this.next.add(name);
			}
		}
		//ɾ�����
		public void del(String name)
		{
			if(this.next!=null)
			{
				if(this.next.name.equals(name))
				{
					this.next = this.next.next;
				}
				else
				{
					this.next.del(name);
				}
			}
		}
		//������н��
		public void print()
		{
			if(this.next!=null)
			{
				System.out.print("-->"+this.next.name);
				this.next.print();
			}
		}
	}
}