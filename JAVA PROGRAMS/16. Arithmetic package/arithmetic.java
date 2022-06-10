import java.util.Scanner;
import arithmetic.add;
import arithmetic.diff;
import arithmetic.prod;
import arithmetic.div;

public class arithmetic
{
	public static void main(String args[])
	{
		int ch;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n.....MENU.....\n1.Addition\n2.Difference\n3.Product\n4.Division\nChoose an option : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1	:add obj1 = new add();
					obj1.calc();
					break;
			case 2	:diff obj2 = new diff(); 
					obj2.calc();
					break;
			case 3	:prod obj3 = new prod();
					obj3.calc();
					break;
			case 4	:div obj4=new div();
					obj4.calc();
					break;
			default	:System.out.println("...Invalid Option...");
					break;
		}
		}while(ch<5);
	}
}