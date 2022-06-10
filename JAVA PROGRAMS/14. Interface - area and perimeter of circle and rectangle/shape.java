import java.util.Scanner;
interface result
{
	public void area();
	public void perimeter();
}


class circle implements result
{
	Scanner sc=new Scanner(System.in);
	float r;
	
	public void area()
	{
		System.out.println("Enter the radius : ");
		r=sc.nextFloat();
		System.out.println("Area of the circle : "+3.14*r*r);
	}
	
	public void perimeter()
	{
		System.out.println("Area of the circle : "+2*3.14*r);
	}
}


class rectangle implements result
{	
	Scanner sc=new Scanner(System.in);
	float l,b;
	
	public void area()
	{
		System.out.println("Enter the length of the rectangle : ");
		l=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle : ");
		b=sc.nextFloat();
		System.out.println("Area of the rectangle : "+l*b);
	}
	
	public void perimeter()
	{
		System.out.println("Area of the rectangle : "+2*(l+b));
	}
}

class shape
{
	public static void main(String args[])
	{
		int opt;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n...Choose a shape...\n1.Circle\n2.Rectangle");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1 : circle c=new circle();
					c.area();
					c.perimeter();
					break;
			case 2 : rectangle rect=new rectangle();
					rect.area();
					rect.perimeter();
					break;
			default : System.out.println("...Invalid option...");
					break;
		}
		}
		while(opt<3);
	}
}

