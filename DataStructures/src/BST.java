package bst;

class Node{
	int data;
	Node left;
	Node right;
}

class Binary{
	public Node insert(Node node,int value) {
		if(node==null) {
			return createnewnode(value);
		}
		if(value<node.data) {
			node.left=insert(node.left,value);
		}else if(value>node.data){
			node.right=insert(node.right,value);
			
		}
		return node;
		
	}
	private Node createnewnode(int k) {
		// TODO Auto-generated method stub
		Node a= new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		
		return a;
	}

   public void inorder(Node node) {
	if(node==null) {
		return;
	}
	inorder(node.left);
	System.out.println(node.data);
	inorder(node.right);
	
}


  public void preorder(Node node) {
	  if(node==null) {
	  return;
	  }
	  System.out.println(node.data);
	  preorder(node.left);
	  preorder(node.right);
  }
  
  public void postorder(Node node) {
	  if(node==null) {
	  return;
	  }
	 
	  postorder(node.left);
	  postorder(node.right);
	  System.out.println(node.data);
  }
  
  public Node delete(Node node, int value) {
	  if(node==null) {
		  return null;
	  }
	  if(value<node.data) {
		  node.left=delete(node.left, value);
		  
	  }else if(value>node.data) {
	     node.right=delete(node.right, value);
	  } else {
		  if(node.left==null || node.right==null) {
			  Node temp=null;
			  temp=node.left==null ? node.right:node.left;
			  
			  if(temp==null) {
				  return null;
			  }else {
				  return node;
			  }
		  }else {
			  Node successor=getSuccessor(node);
			  node.data=successor.data;
			  node.right=delete(node.right,4);
			  return node;
		  }
	  }
	  return node;
  }
  public Node getSuccessor(Node node) {
	  if(node==null) {
		  return null;
		  
	  }
	  Node temp=node.right;
	  while(temp!=null) {
		  temp=temp.left;
	  }
	  return temp;
  }
}
public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary a= new Binary();
		Node root=null;
		root=a.insert(root,8);
		root=a.insert(root,3);
		root=a.insert(root,6);
		root=a.insert(root,10);
		root=a.insert(root,4);
		root=a.insert(root,7);
		root=a.insert(root,1);
		root=a.insert(root,14);
		root=a.insert(root,13);
		System.out.println("inorder");
		a.inorder(root);
		System.out.println("preorder");
		a.preorder(root);
		System.out.println("postorder");
		a.postorder(root);
		System.out.print("delete");
		root=a.delete(root, 14);


	}
}

