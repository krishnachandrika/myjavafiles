package project1;

import java.util.Iterator;


public class Deque <Item> implements Iterable<Item>  {
	private Node first;
	private Node last;
	int count;
	public class Node{
		private Node next;
		private Node prev;
		private Item item;
		
	}
	
	
	public Deque() {
		count=0;
		first=null;
		last=null;			
	}
	
	public boolean isEmpty() {
		return first==null;		
	}
	
	public int size() {
		return count;
	}
	
	public void addFirst(Item item) {
		if(item==null) {
			throw new java.lang.NullPointerException();
		}
		if(count==0) {
			first=new Node();
			first.item=item;
			last=first;
		}else {
			Node oldfirst=first;
			first=new Node();
			first.item=item;
			first.next=oldfirst;
			oldfirst.prev=first;
			
		}
		count++;
			
	}
	
	public void addLast(Item item) {
		if (item == null) {
            throw new java.lang.NullPointerException();
        }
        Node newnode = new Node();
        newnode.item = item;
        if (last != null) {
            newnode.prev = last;
            last.next = newnode;
        }
        last = newnode;
        if (first == null) {
            first = last;
        }
        count++;
	}
	
	public Item removeFirst() {
		if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Item item = first.item;
        if (count == 1) {
            last = null;
            first = null;
        } else {
            first.next.prev = null;
            first = first.next;
        }
        count--;
        return item;
    }
		
	public Item removeLast() {
		 if (isEmpty()) {
	            throw new java.util.NoSuchElementException();
	        }
	        Item item = last.item;
	        if (last.prev == null) {
	            last = null;
	            first = null;
	        } else {
	            last.prev.next = null;
	            last = last.prev;
	        }
	        count--;
	        return item;
	    }
	

	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator(first);
	}
	private class ListIterator implements Iterator<Item> {
        private Node current;
        public ListIterator(Node initialNode) {
            current = initialNode;
        }
        public boolean hasNext() {
            return current != null;
        }
        public Item next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque DQ = new Deque(); 
		 DQ.addLast(21175);
		 DQ.addFirst(57648); 
		 DQ.addFirst(74343);
		 DQ.addLast(86975);
		 Iterator obj = DQ.iterator(); 
		 System.out.println("Deque values");
		 while(obj.hasNext()) {
			 System.out.println(obj.next()); 
		 }
		 DQ.iterator();
		 DQ.removeFirst();	
		 DQ.removeLast();
		 obj = DQ.iterator(); 
		    System.out.println("Deque removing:"); 
		    while (obj.hasNext()) { 
		        System.out.println(obj.next()); 
		    } 

	}

	
	

}
