package parenthesis;

class stack{
	int size=-1;
	char parenthesis[];
	public stack(int length) {
		// TODO Auto-generated constructor stub
	}

	void Stack(int size)
	{
	parenthesis=new char[size];
	}
	
	void push(char c) {
		if(size==-1)
		{
		System.out.println("size minus "+ c);
		parenthesis[++size]=c;
		}
		else if(peek()=='{' && c=='}' || peek()=='[' && c==']' ||peek()=='(' && c==')')
		{

		pop();
		}
		else {
		parenthesis[++size]=c;
		}
	}
	
	char pop() {
		if(size>=0) {
			return parenthesis[size--];
			}
			else {
			return ' ';
			}
	}
	
	char peek() {
		if(size>=0) {
			return parenthesis[size];
			}
			else {
			return ' ';
			}

	}
	
	boolean isEmpty() {
		return size==-1;
	}
}

public class StackParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="[()]{}{[()()]()}";

		stack ob=new stack(s.length());

		for(int i=0;i<s.length();i++) {

		ob.push(s.charAt(i));
		}
		
		System.out.println(ob.isEmpty());
		System.out.println(ob.peek());


	}

}
