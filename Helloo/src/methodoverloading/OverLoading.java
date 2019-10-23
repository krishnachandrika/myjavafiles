package methodoverloading;

public class OverLoading {
	public void printData(int a)
	{
		System.out.println(a);

	}
	public void printData(double a)
	{
		System.out.println(a);

	}
	public void printData(float a)
	{
		System.out.println(a);

	}
	public void printData(char a)
	{
		System.out.println(a);

	}
	public void printData(boolean a)
	{
		System.out.println(a);

	}
	public void printData(String a)
	{
		System.out.println(a);

	}
	public void printData(long a)
	{
		System.out.println(a);

	}
	
public static void main(String args[]) {
	OverLoading obj = new OverLoading();
	obj.printData(10);
	obj.printData(33.33);
	obj.printData(12.15f);
	obj.printData("s");
	obj.printData("Method");
	obj.printData(2345);
}

}
