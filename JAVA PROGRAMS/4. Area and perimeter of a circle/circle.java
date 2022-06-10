
import java.util.Scanner;
class calculate
{
	double r,ar,per;
	double area()
	{
		
		ar=3.14*r*r;
		return ar;
	}
	
	double perimeter()
	{
		
		per=2*3.14*r;
		return per;
	}
	
	void display()
	{
		System.out.println("Area of the circle = "+ar);
		System.out.println("Perimeter of the circle = "+per);
		System.out.println();
	}
}

class circle
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("...Program to find the area and perimeter of a circle...");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of the first circle : ");
		calculate c1=new calculate();
		c1.r=sc.nextFloat();
		c1.area();
		c1.perimeter();
		c1.display();
		
		System.out.println("Enter the radius of the second circle : ");
		calculate c2=new calculate();
		c2.r=sc.nextFloat();
		c2.area();
		c2.perimeter();
		c2.display();
	}
}