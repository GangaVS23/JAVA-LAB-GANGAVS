import java.util.Scanner;
import graphics.circle;
import graphics.rect;
import graphics.sqr;
import graphics.tri;

public class graphics
{
	public static void main(String args[])
	{
		int ch;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n.....MENU.....\n1.Circle\n2.Rectangle\n3.Triangle\n4.Square\nChoose an option : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1	:circle obj1 = new circle();
					obj1.area();
					break;
			case 2	:rect obj2 = new rect(); 
					obj2.area();
					break;
			case 3	:tri obj3 = new tri();
					obj3.area();
					break;
			case 4	:sqr obj4=new sqr();
					obj4.area();
					break;
			default	:System.out.println("...Invalid Option...");
					break;
		}
	}while(ch<5);
	}
}