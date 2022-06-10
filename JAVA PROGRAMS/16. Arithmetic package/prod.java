package arithmetic;


import java.util.Scanner;
public class prod
{
	public void calc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number : ");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("Product : "+c);
	}
}