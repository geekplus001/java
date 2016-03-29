package ���ݽṹ֮������ʵ��.com.vince.bt;

public class BinaryTree 
{
	private Node root;//���ڵ�
	
	//��ӽڵ㣬�ṩ�����ⲿ����
	public void add(int data)
	{
		if(root==null)
			root = new Node(data);
		else
		{
			root.addNode(data);
		}
	}
	//����ڵ㣬�ṩ�����ⲿ����
	public void print()
	{
		if(root!=null)
		{
			root.printNode();
		}
	}
	
	
	//�ڽ����
	class Node
	{
		private int data;//��ǰ�ڵ�����
		private Node left;//������
		private Node right;//������
		public Node(int data)
		{
			this.data = data;
		}
		//��ӽ��
		public void addNode(int data)
		{
			if(this.data>data)
			{
				if(this.left==null)
				{
					this.left = new Node(data);
				}
				else
				{
					this.left.addNode(data);
				}
			}
			else if(this.data<=data)
			{
				if(this.right==null)
				{
					this.right = new Node(data);
				}
				else
				{
					this.right.addNode(data);
				}
			}
		}
		//������(����������󣬸�����)
		public void printNode()
		{
			if(this.left!=null)
			{
				this.left.printNode();
			}
			System.out.print(this.data+" ");
			if(this.right!=null)
			{
				this.right.printNode();
			}
		}
	}
}
