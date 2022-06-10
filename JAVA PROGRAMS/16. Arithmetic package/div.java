package arithmetic;

import java.util.Scanner;
public class div
{
	public void calc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		float a=sc.nextFloat();
		System.out.println("Enter the second number : ");
		float b=sc.nextFloat();
		float c=a/b;
		System.out.println("Sum : "+c);
	}
}