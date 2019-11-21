package DLL;
public class DoubleLinkedList {
	private	Node head;						
	private	Node tail;						
	private	int	size=0;
	private	static class Node{												
		private	int	value;												
		private	Node next;												
		private	Node prev;
		public	Node(int v,	Node nxt, Node prv)	{																		
			value=v;																		
			next=nxt;																		
			prev=prv;												
			}
			public	Node(int v)	{																		
				value=v;																		
				next=null;																		
				prev=null;												
				}						
			}
	
	public	void insert(int value)	{						
		Node newNode=new Node(value);
		newNode.value=value;
		if(head==null) {
		tail=head=newNode;
		}
		else {
		newNode.prev=head;                                  
		head.next=newNode;
		head=newNode;
		}
	}
	
	public void InsertEnd(int value) {
		Node new_node = new Node(value); 
		Node last = head; 
		new_node.next = null; 
		if (head == null) { 
			new_node.prev = null; 
			head = new_node; 
		} 
		while (last.next != null) 
			last = last.next; 
		tail.next = new_node; 
		new_node.prev = tail; 
		tail=new_node;
		size++;
	}
	void display() {
		Node temp=head;
		while(temp!=null) {
		System.out.println(temp.value);
		temp=temp.prev;
		}
		System.out.println("from tail");

		temp=tail;
		while(temp!=null) {
		System.out.println(temp.value);
		temp=temp.next;
		}
		
	}

	
	public static void main(String args[]) {
		DoubleLinkedList ob=new DoubleLinkedList();
		ob.insert(1);
		ob.insert(9);
		ob.insert(5);
		ob.insert(2);
		ob.display();
		ob.InsertEnd(4);
		ob.display();
		
	}

}
