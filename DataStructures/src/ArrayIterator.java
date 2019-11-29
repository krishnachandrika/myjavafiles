package arrayiterator;

import java.util.Iterator;
import java.util.Random;

class Arit<Item> implements Iterator
{
	int count=0;
	int length=1;
	int[] arr;
	Arit(int[] arr2){
		arr= arr2;
	}
	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return count<arr.length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object t=arr[count];
		count++;
		return t;
	}
	
}
public class ArrayIterator implements Iterable 
{
	static int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		ArrayIterator ob=new ArrayIterator();
		System.out.println("before");
		Iterator it=ob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

	@Override
	public Iterator iterator() {
		System.out.println("calls iterator");
		// TODO Auto-generated method stub
		 return new Arit(arr);
	}

}
