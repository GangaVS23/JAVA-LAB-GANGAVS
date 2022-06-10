import java.util.Scanner;
class fib implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for fibonacci number series : ");
		int n=sc.nextInt();
		int a=0,b=1,c=(a+b),i;
		System.out.println("Fibonacci series : ");
		for(i=1;i<=n;i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
	}
}

class even implements Runnable
{
	public void run()
	{
		int i,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for number of even numbers : ");
		int n=sc.nextInt();
		System.out.println("Even numbers : ");
		for(i=1;k<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				k++;
			}		
		}
	}
}

class thread2
{
	public static void main(String args[])
	{
		fib f=new fib();
		Thread t1=new Thread(f);
		even e=new even();
		Thread t2=new Thread(e);
		t1.start();
		t2.start();
	}
}