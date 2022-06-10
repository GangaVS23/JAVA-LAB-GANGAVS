/*Program to create a class for Employee having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects. */
import java.util.Scanner;
class emp{
	int eno;
	String ename;
	int esalary;
	
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee number : ");
		eno=sc.nextInt();
		System.out.println("Enter the employee name : ");
		ename=sc.next();
		System.out.println("Enter the employee's salary : ");
		esalary=sc.nextInt();
	}
	
	
}

public class employee{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees : ");
		int n=sc.nextInt();
		emp e[]=new emp[n];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new emp();
		}
		int k=1;
		for(int i=0;i<e.length;i++)
		{
			
			System.out.println("\nEnter the details of employee "+k+" : ");
			k=k+1;
			e[i].read();
			
		}
		
		System.out.println("Enter the eno of the employee to be searched");
		int em=sc.nextInt();
		
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(e[i].eno==em)
			{
				System.out.println("\nEmployee found\n...DETAILS...\nEmployee number : "+em+"\nName : "+e[i].ename+"\nEmployee salary : "+e[i].esalary);
				return;
			}
			else
				c=c+1;
			if(c==n)
				System.out.println("\nEmployee not found!");
		}
	
		
	}
}