package stackandqueue;

public class pb2 {
	static int a[]=new int[30];
	static int first=0;
	static int last=0;
	static int count=0;
	public void enqueue(int data) {
		try {
				a[last]=data;
				last=last+1;
				count=count+1;
		}catch(Exception e) {

		}
	}
	void dequeue() {
		if(count<0)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println(+a[first]);
			a[first]=-1;
		    first=first+1;
		}
	}
	void display() {
		for(int i=0;i<count;i++) {
			if(a[i]!=-1)
				System.out.println(a[i]);
		}
	}
	void isempty()
	{
		if(count<0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue is not empty");
		}
	}



}
