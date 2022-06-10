import java.util.Scanner;
class employee
{
	int Empid,Salary;
	String Name,Address;
	employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id : ");
		Empid=sc.nextInt();
		System.out.println("Enter the employee name : ");
		Name=sc.next();
		System.out.println("Enter the employee's salary : ");
		Salary=sc.nextInt();
		System.out.println("Enter the employee's address : ");
		Address=sc.next();
	}
}

class teacher extends employee
{
	String department,Subjects;
	teacher()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department : ");
		department=sc.next();
		System.out.println("Enter the subjects taught : ");
		Subjects=sc.next();
	}
	
	void display()
	{
		System.out.println("Employee id : "+Empid);
		System.out.println("Employee name : "+Name);
		System.out.println("Employee's salary : "+Salary);
		System.out.println("Employee's address : "+Address);
		System.out.println("Department : "+department);
		System.out.println("Subjects taught are : "+Subjects);
	}
}

public class emp{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees : ");
		int n=sc.nextInt();
		teacher t[]=new teacher[n];
		for(int i=0,k=1;i<t.length;i++,k++)
		{
			System.out.println("\nEnter the details of employee "+k+" : ");
			t[i]=new teacher();
		}
		
		for(int i=0,k=1;i<t.length;i++,k++)
		{
			System.out.println("\nDetails of employee "+k+" : ");
			t[i].display();
		}
	}
}