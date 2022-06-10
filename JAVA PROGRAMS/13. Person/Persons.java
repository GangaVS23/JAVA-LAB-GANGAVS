import java.util.Scanner;

class person
{
	String name,address,gender;
	int age;
	Scanner sc=new Scanner(System.in);
	person()
	{
		System.out.println("Enter the name : ");
		name=sc.next();
		System.out.println("Enter the gender : ");
		gender=sc.next();
		System.out.println("Enter the address : ");
		address=sc.next();
		System.out.println("Enter the age : ");
		age=sc.nextInt();
	}
}


class employee extends person
{
	String company_name,qual,empid;
	int sal;
	employee()
	{
		super();
		System.out.println("Enter the employee id : ");
		empid=sc.next();
		System.out.println("Enter the company name : ");
		company_name=sc.next();
		System.out.println("Enter the qualification : ");
		qual=sc.next();
		System.out.println("Enter the salary : ");
		sal=sc.nextInt();
	}
}


class teacher extends employee
{
	String subject,dept,teacherid;
	teacher()
	{
		super();
		System.out.println("Enter the subject : ");
		subject=sc.next();
		System.out.println("Enter the department name : ");
		dept=sc.next();
		System.out.println("Enter the teacher id : ");
		teacherid=sc.next();
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
		System.out.println("Emp id : "+empid);
		System.out.println("Company name : "+company_name);
		System.out.println("Qualification : "+qual);
		System.out.println("Salary : "+sal);
		System.out.println("Subject : "+subject);
		System.out.println("Department : "+dept);
		System.out.println("Teacher id : "+teacherid);
	}
}

class Persons
{
	public static void main(String args[])
	{
		int n,i,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of teachers : ");
		n=sc.nextInt();
		teacher t[]=new teacher[n];
		for(i=0,k=1;i<t.length;i++,k++)
		{
			System.out.println("\nEnter the details of teacher "+k+" : ");
			t[i]=new teacher();
		}
		for(i=0,k=1;i<t.length;i++,k++)
		{
			System.out.println("\nDetails of teacher "+k+" : ");
			t[i].display();
		}
	}
}
