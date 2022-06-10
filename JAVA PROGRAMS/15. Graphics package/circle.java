package graphics;


import java.util.Scanner;
public class circle
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double r=sc.nextDouble();
		double ar=3.14*r*r;
		System.out.println("Area of the circle : "+ar);
	}
}
