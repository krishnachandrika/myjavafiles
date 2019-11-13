package stackandqueue;

public class pb1 {
	static int a[]=new int[30];
	static int count=0;
	int n=0;
	
	public void push(int data) {
		try {
				a[n]=data;
				n=n+1;
				count=count+1;
		}catch(Exception e) {
			System.out.println(e);
		}

		}
		
		void pop() {
			if(count < 0)
			{
				System.out.println( "Stack Underflow");
				
			}
			else
			{
				System.out.println(a[count-1]);
				a[count]=-1;
				count=count-1;
			}
		}
	
		
	 void display() {
			for(int i=0;i<count;i++) {
				System.out.println(a[i]);
			}
	 }
			
	 void isEmpty()
	 {
	   if(count < 0)
	   {
	     System.out.println( " Stack is empty");
	   }
	   else
	   {
	     System.out.println( "Stack is not empty");
	   }	
	
	 }

}
