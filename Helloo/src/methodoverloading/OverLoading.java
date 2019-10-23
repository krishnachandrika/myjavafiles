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
	obj.printData(15);
	obj.printData(44.33);
	obj.printData(9.15f);
	obj.printData("K");
	obj.printData("chandu");
	obj.printData(12345);
}

}
