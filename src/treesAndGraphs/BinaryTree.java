package treesAndGraphs;

public class BinaryTree {
	
	static Node root;
	
	public class Node{
		
		int value;
		Node left, right;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public void add(int value)
	{
		root = addNodeRecursive(root,value);
	}
	
  public Node addNodeRecursive(Node current, int data)
	{
		if(current == null)
		{
			return new Node(data);
		}
		
		if(current.value>data)
		{
			addNodeRecursive(current.left,data);
		}
		else if(current.value<data)
		{
			addNodeRecursive(current.right,data);
		}
		else 
		{
		return current;
		}
		return current;
	}
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.add(3);
		bt.add(6);
		bt.add(9);
		bt.add(41);
		bt.add(11);
		bt.add(89);
		bt.add(15);
		bt.add(55);
		
		System.out.println(root.right.value);
		
	}
	

}
