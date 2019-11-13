package CLL;
public class CircularLinkedList {
	private	Node tail;						
	private	int	size	=	0;
	private	static	class	Node	{												
		private	int	value;												
		private	Node next;
	public	Node(int v,	Node n)	{																		
		value =	v;																		
		next = n;												
		}
	public	Node(int v)	{																		
		value =	v;																		
		next =	null;												
		}						
	} 
	public void addHead(int value) {
	Node temp	=	new	Node(value,	null);					
	if	(isEmpty())	{												
		tail	=	temp;												
		temp.next	=	temp;						
		}	else	{												
			temp.next=tail.next;												
			tail.next=temp;						
			}						
	size++; 
	}
	
private boolean isEmpty() {
		// TODO Auto-generated method st
	if(size<=0) {
		return true;
	}
		return false;
	}

public	void addTail(int	value)	{						
	Node	temp	=	new	Node(value,	null);					
	if	(isEmpty())	{												
		tail=temp;											
		temp.next=temp;						
		}	
	
	else	{												
		temp.next=tail.next;												
		tail.next=temp;												
		tail=temp;						
		}						
	size++; 
	}

void searchList(int	data)	{						
	Node temp	=	tail;						
	for	(int i=0;i<size;i++)	{												
		if	(temp.value	==	data) {	
			System.out.print("search:");
			System.out.println(temp.value);	
			break;
		}
		else
			temp=temp.next;
	}
	}

public	int	removeHead()	throws	IllegalStateException	{						
	if	(isEmpty())	{												
		throw	new	IllegalStateException("EmptyListException");						
		}						
	int	value=tail.next.value;						
	if	(tail==tail.next)	{											
		tail=null;	
	}
	else												
		tail.next=tail.next.next;						
	size--;						
	return	value; 
	}

void display() {
	Node current=tail.next;
	while(current!=tail) {
		System.out.println(current.value);
		current=current.next;
	}
	System.out.println(current.value);
}

public	static	void	main(String[]	args)	{						
	CircularLinkedList	ll	=	new	CircularLinkedList();
	System.out.println("add head");
	ll.addHead(1);						
	ll.addHead(2);						
	ll.addHead(3);						
	ll.addHead(1);						
	ll.addHead(4);						
	ll.addHead(3);
	ll.display();
	System.out.println("add tail");
	ll.addTail(5);
	ll.display();
	ll.searchList(2);
	ll.removeHead();
	ll.display();
	

}
}
