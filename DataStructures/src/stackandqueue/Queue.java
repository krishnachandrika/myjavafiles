package stackandqueue;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Queue with arrays");
		pb2 obj=new pb2();
		String c;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Enqueue elemnts in queue \n2. Dequeue elemnts in queue \n3. display elemnts in queue \n4. Check queue is status\n");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();

			switch(n) {
			case 1:
				System.out.println("Enter number of elements");
				int i=s.nextInt();
				System.out.println("Enter data");
				int l=0;
				while(l!=i) {
					int k=s.nextInt();
				obj.enqueue(k);
				l=l+1;
				}
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				obj.isempty();
				break;
			default:
				System.out.println("Choose correct option");
				System.exit(0);
			}
			System.out.println("Do you want to continue Y/N");
			c=s.next();
		}while(c.equals("Y")||c.equals("y"));
		System.out.println("Queue Exit");


	}

}
