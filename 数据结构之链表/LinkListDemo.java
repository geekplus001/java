//链表数据结构
public class LinkListDemo
{
	public static void main(String[] args)
	{
		NodeManager nm = new NodeManager();
		nm.addNode("结点1");
		nm.addNode("结点2");
		nm.addNode("结点3");
		nm.addNode("结点4");
		nm.addNode("结点5");
		nm.printNode();
		nm.delNode("结点3");
		nm.printNode();
	}
}

//链表结点管理
class NodeManager
{
	private Node root;//根节点
	//添加结点
	public void addNode(String name)
	{
		//如果根节点为空，那么添加的就是根节点
		if(root==null)
		{
			root = new Node(name);
		}
		else
		{
			root.add(name);
		}
	}
	//删除结点
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
	//输出所有结点
	public void printNode()
	{
		if(root!=null)
		{
			System.out.print(root.name);
			root.print();
			System.out.println();
		}
		
	}

	//定义一个结点内部类
	class Node
	{
		private String name;//结点名称
		private Node next;//表示下一个结点对象
		private Node(String name)
		{
			this.name = name;
		}
		//添加结点
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
		//删除结点
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
		//输出所有结点
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