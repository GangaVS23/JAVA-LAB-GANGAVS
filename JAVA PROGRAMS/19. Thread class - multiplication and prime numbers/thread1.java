import java.util.Scanner;
class mult extends Thread
{
	public void run()
	{
		System.out.println("....Multiiplication table of 5....");
		for(int i=1;i<=10;i++)
		{
			System.out.println(5+" * "+i+" = "+(5*i));
		}
	}
}

class prime extends Thread
{
	public void run()
	{
		int n,i,j,k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for number of prime numbers : ");
		n=sc.nextInt();
		System.out.println("Prime numbers:");

		for(i=2;k<=n;i++)
		{
			int count=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}				
			if(count==0)
			{
				System.out.println(i);
				k++;
			}			
		}
	
	}
}

class thread1
{
	public static void main(String args[])
	{
		mult m=new mult();
		prime p=new prime();
		p.start();
		m.start();	
	}
}