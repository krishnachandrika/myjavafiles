package project1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue <Item> implements Iterable<Item> {
	private Item[] q;
	private int n;
	
	public RandomizedQueue() {
		q=(Item[]) new Object[2];
		n=0;
	}
	
	public int size() {
    	return n;
    }
    
    public void resize(int capacity) {
    	Item[] copy=(Item[]) new Object[capacity];
    	for(int i=0;i<n;i++) {
    		copy[i]=q[i];
    	}
    	q=copy;
    }
    
    public void enqueue(Item item) {
    	if(item==null) {
    		throw new NullPointerException();
    	}
    	if(n==q.length) {
    		resize(2*q.length);
    	}
    	q[n++]=item;
    }
    
    public Item dequeue() {
    	if(size()==0) {
    		throw new NoSuchElementException();
    	}
    	int radum = generateRandomInt(n);
        Item value = q[radum];
        if(radum!= n-1) {q[radum] = q[n-1];}
        q[n-1] = null;
        n--;
        if(n > 0 && n <= q.length/4)
        {
            resize(q.length/2);
        }
        return value;
    }
    
    private int generateRandomInt(int upperRange) {
		// TODO Auto-generated method stub
		Random random = new Random();
        return random.nextInt(upperRange);
	}
    
    public Item sample()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }
        int rand = generateRandomInt(n);
        Item value = q[rand];
        if(n > 0 && n == q.length/4)
        {
            resize(q.length/2);
        }
        return value;
    }

	
	
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new RandIterator();
	}
	 private class RandIterator implements Iterator<Item>{
	        private int randnum = 0;
	     
	        private int copySize = n;
	        private Item[] copy = (Item[]) new Object[copySize];

			private int randLoc;
	        
	        private RandIterator(){
	            for(int i = 0; i<copySize;i++)
	            {
	                copy[i] = q[i];
	            }
	        }
	        
	        
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				 return copySize > 0;
			}

			@Override
			public Item next() {
				// TODO Auto-generated method stub
				 if(copySize == 0)
		            {
		                throw new NoSuchElementException();
		            }
		            randLoc = generateRandomInt(copySize);
		            Item currentItem = copy[randLoc];
		            if(randLoc != copySize-1)
		            {
		                copy[randLoc] = copy[copySize-1];
		            }
		            copy[copySize-1] = null;
		            copySize--;
		            return currentItem;
		        }
			}
			
			public void remove()
	        {
	            throw new UnsupportedOperationException();
	        }
	 
	        
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedQueue<String> x = new RandomizedQueue<String>();
        x.enqueue("5’2");
        x.enqueue("my");
        x.enqueue("height");
        x.enqueue("but");
        x.enqueue("my");
        x.enqueue("atiitude");
        x.enqueue("6’1");
        for(String s: x)
        {
            for(String s2:x)
            {
                System.out.println(s2 += " ");
            }
            System.out.print("  "+s +"="+" ");
        }

	}

}

