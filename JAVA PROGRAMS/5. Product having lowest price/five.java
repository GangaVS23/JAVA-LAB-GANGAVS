import java.util.Scanner;
class product
{
	int pcode;
	float price;
	String pname;
	void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of the product : ");
		pcode=sc.nextInt();
		System.out.println("Enter the name of the product : ");
		pname=sc.next();
		System.out.println("Enter the price of the product : ");
		price=sc.nextFloat();
		System.out.println();
	}
}

class five
{
	public static void main(String args[])
	{
		System.out.println();
		product o1= new product();
		System.out.println("Enter the details of the 1st product : ");
		o1.details();
		product o2= new product();
		System.out.println("Enter the details of the 2nd product : ");
		o2.details();
		product o3= new product();
		System.out.println("Enter the details of the 3rd product : ");
		o3.details();
		if(o1.price<o2.price && o1.price<o3.price)
		{
			System.out.println("1st product "+o1.pname+" have the lowest price");
		}
		else if(o2.price<o1.price && o2.price<o3.price)
		{
			System.out.println("2nd product "+o2.pname+" have the lowest price");
		}
		else
		{
			System.out.println("3rd product " + o3.pname + " have the lowest price");
		}
	}
}
