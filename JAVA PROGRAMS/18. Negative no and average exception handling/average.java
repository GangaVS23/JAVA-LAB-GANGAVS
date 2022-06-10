import java.util.Scanner;
class negative extends Exception
{
	public negative(String str)
	{
		super(str);
	}
}

class read
{
	Scanner sc=new Scanner(System.in);
	void get() throws negative
	{
		System.out.println("Enter the number of numbers : ");
		int n=sc.nextInt();
		System.out.println("Enter the numbers : ");
		int sum=0;
		for(int i=0,k=1;i<n;i++,k++)
		{
			System.out.println("Enter the number "+k+" : ");
			int num=sc.nextInt();
			if(num<0)
			{
				throw new negative("The number entered is negative..!");
			}
			sum=sum+num;
		}
		float avg=(sum)/n;
		System.out.println("Average : "+avg);
		
	}
}
	
public class average
{
	public static void main(String args[])
	{
			
		read c=new read();
		try
		{
			c.get();
		}
		catch(negative i)
		{
			System.out.println("Exception occured\n"+i);	
		}
	}
}