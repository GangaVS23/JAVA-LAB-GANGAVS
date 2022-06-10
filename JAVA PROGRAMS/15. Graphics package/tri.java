package graphics;

import java.util.Scanner;
public class tri
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base length of the triangle : ");
		double b=sc.nextDouble();
		System.out.println("Enter the base height of the triangle : ");
		double h=sc.nextDouble();
		double ar=0.5*b*h;
		System.out.println("Area of the triangle : "+ar);
	}
}