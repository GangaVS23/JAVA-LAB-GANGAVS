package graphics;

import java.util.Scanner;
public class rect
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle : ");
		double l=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle : ");
		double b=sc.nextDouble();
		double ar=l*b;
		System.out.println("Area of the rectangle : "+ar);
	}
}