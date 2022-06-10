package graphics;


import java.util.Scanner;
public class sqr
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square : ");
		double a=sc.nextDouble();
		double ar=a*a;
		System.out.println("Area of the square : "+ar);
	}
}