import java.util.Scanner;
class invalid extends Exception
{
	public invalid(String str)
	{
		super(str);
	}
}

class read
{
	Scanner sc=new Scanner(System.in);
	String username="ganga",pass="123";
	String un,pw;
	void get() throws invalid
		{

			System.out.println("Enter the username : ");
			un=sc.next();
			System.out.println("Enter the password : ");
			pw=sc.next();
			if(username.equals(un) && pass.equals(pw))
			{
				System.out.println("Logged in...!");
			}
			else
			{
				throw new invalid("Invalid username or password");
			}
		}
		
	}
	
public class password
{
	public static void main(String args[])
	{
		read c=new read();
		try
		{
			c.get();
		}
		catch(invalid i)
		{
			System.out.println("Exception occured\n"+i);	
		}
	}
}