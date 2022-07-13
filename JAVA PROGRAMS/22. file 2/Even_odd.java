import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Even_odd
{
	public static void main(String Args[])
	{
		int x;
		try
		{
FileWriter obj1=new FileWriter("even.txt",true);
FileWriter obj2=new FileWriter("odd.txt",true);

File obj3=new File("integers.txt");
Scanner sc=new Scanner(obj3);
while(sc.hasNextLine())
{
x=sc.nextInt();
if(x%2==0)
{
obj1.write(String.valueOf(x));  
}
else
{
obj2.write(String.valueOf(x));
}
}
obj1.close();
obj2.close();
}
catch(Exception e)
{

}
}
}