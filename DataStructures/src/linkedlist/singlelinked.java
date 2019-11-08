package linkedlist;

public class singlelinked {
	private listnode head;
	private Object printlinkedlist;
	
public void display(listnode head) {
	if(head==null) {
		return;
	}
	listnode current=head;
	while(current!=null) {
		System.out.print(current.data + "-->");
		current=current.next;
		
	}
	System.out.print(current);
}
	
	
	
	private static class listnode
	{
		private int data;
		private listnode next;
		
		public listnode(int data) {
			this.data=data;
			this.next=next;
			
		}
		
	}
	
	public listnode insertBeginning(listnode head, int data) {
	
		listnode newnode= new listnode(data);
		if(head==null) {
			return newnode;
		}
		newnode.next=head;
		head=newnode;
		return head;
	}
	
	public listnode insertatend(listnode head,int data) {
		listnode newnode=new listnode(data);
		if(head==null) {
			return newnode;
		}
		listnode current= head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newnode;
		return head;
	}
	public int length(listnode head) {
		if(head==null) {
			return 0;
		}
		int count=0;
		listnode current=head;
		while(current!=null) {
			count++;
			current=current.next;
			
		}
		return count;
		
	}
	
	
	public listnode reverse(listnode head) {
		if(head==null) {
			return head;
		}
		 
	listnode current=head;
	listnode previous=null;
	listnode next=null;
	
	while(current!=null) {
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
		
	}
	return previous;
	}
	
	
	public listnode middle() {
		try {
		if(head==null) {
			return null;
		}
		listnode slowptr=head;
		listnode fastptr=head;
		
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		return slowptr;
	}catch(ArithmeticException e){
		System.out.println(e);
		}
		return head;
	}
	public listnode insertinsort(int value) {
		listnode newnode= new listnode(value);
		if(head==null) {
			return newnode;
			
		}
		listnode current=head;
		listnode temp=null;
		while(current!=null && current.data<newnode.data) {
			temp=current;
			current=current.next;
		}
		newnode.next=current;
		temp.next=newnode;
		return head;
	}
	
	
	public listnode deletefirst(listnode head) {
		if(head==null) {
			return head;
			
		}
		listnode current=head;
		current=head.next;
		//current.next=null;
		return head;
		
	}
	
	public listnode deletelast(listnode head) {
		if(head==null) {
			return head;
			
		}
		listnode last=head;
		listnode previouslast=null;
		while(last.next!=null) {
			previouslast=last;
			last=last.next;
		}
		//previouslast.next=null;
		return last;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listnode head=new listnode(5);
		listnode second=new listnode(10);
		listnode third=new listnode(4);
		listnode forth=new listnode(12);
		
		head.next=second;
		second.next=third;
		third.next=forth;
		
		singlelinked singlelinked=new singlelinked();
		singlelinked.display(head);
		System.out.println();
		listnode newhead=singlelinked.insertBeginning(head,15);
		singlelinked.display(newhead);
		System.out.println();
		listnode newhead1=singlelinked.insertatend(head,15);
		singlelinked.display(newhead1);
		System.out.println();
		System.out.println("length is:"+ singlelinked.length(head));
		System.out.println();
		listnode reverselisthead=singlelinked.reverse(head);
        singlelinked.display(reverselisthead);
        System.out.println();
		//listnode middlenode=singlelinked.middle();
		//System.out.println("middle is:"+ middlenode.data);
        //singlelinked.printLinkedList(11);
        
        System.out.println();
		listnode first=singlelinked.deletefirst(head);
		//singlelinked.display(first);
		System.out.println(first.data);
		
		System.out.println();
		listnode last=singlelinked.deletelast(head);
		//singlelinked.display(last);
		System.out.println(last.data);
       
	}
	

}
