package abstractclass;

abstract class Shape {
	double pi=3.14;
	public void areaperimeter(int n) {
		
	}
	public void display() {
		System.out.println("Shapes");
	}

}

class Triangle extends Shape{
	public void areaperimeter(int n,int n1,int n2) {
		}
	public void display() {
		System.out.println("Triangle");
	}
	
}

class Quadrilateral extends Shape{
	public void areaperimeter(int n,int n1) {
	}
public void display() {
	System.out.println("Quadrilateral");
}
	
}

class circle extends Shape{
	public void areperimeter(int n) {
		int x=(int) (n*pi*n);
		System.out.println("Area:"+x);
		int y=(int) (2*pi*n);
		System.out.println("Perimeter:"+y);
		
}
	public void display() {
		System.out.println("Circle");
	}
	
	
}

class Isosceles extends Triangle{
	public void areaperimeter(int n,int n1,int n2) {
		int x=2*n+n1;
		System.out.println("Area of Isosceles triangle:"+x);
		int y=n+n1+n2;
		System.out.println("Perimeter of Isosceles triangle:"+y);
		
}

public void display() {
	System.out.println("Isosceles Triangle");
}
	
}

class Equilateral extends Triangle{
	public void areaperimeter(int n,int n1,int n2) {
		int x=3*n;
		System.out.println("Area of Equilateral triangle:"+x);
		int y=n+n1+n2;
		System.out.println("Perimeter of Equilateral triangle:"+y);
		
}

public void display() {
	System.out.println("Equilateral Triangle");
}
	
}

class Rectangle extends Quadrilateral{
	public void areaperimeter(int n,int n1) {
		int x=2*n;
		System.out.println("Area of rectangle:"+x);
		int y=2*n+2*n1;
		System.out.println("Perimeter of rectangle:"+y);
		
}

public void display() {
	System.out.println("Rectangele");
}
}

class Square extends Quadrilateral{
	public void areaperimeter(int n) {
		int x=n*n;
		System.out.println("Area of square:"+x);
		int y=4*n;
		System.out.println("Perimeter of square:"+y);
		
}

public void display() {
	System.out.println("Square");
}
	
}

class Rhombus extends Quadrilateral{
	public void areaperimeter(int n,int n1) {
		int x=(int) ((0.5)*n*n1);
		System.out.println("Area of square:"+x);
		int y=4*n;
		System.out.println("Perimeter of square:"+y);
		
}

public void display() {
	System.out.println("Rhombus");
}
	
}


class Shapes{
	public static void main(String args[]) {
		Triangle t=new Isosceles();
        t.display();
        t.areaperimeter(10,20,30);
        Equilateral t1= new Equilateral();
        t1.display();
        t1.areaperimeter(5,10,15);
        Rectangle Q= new Rectangle();
        Q.display();
        Q.areaperimeter(5,10);
        Square Q1= new Square();
        Q1.display();
        Q1.areaperimeter(5);
        Rhombus Q2= new Rhombus();
        Q2.display();
        Q2.areaperimeter(5,15);
        Shape s=new circle();
        s.display();
        s.areaperimeter(5);
	}
	
}
