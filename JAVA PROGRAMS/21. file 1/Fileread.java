import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
class Fileread
{

	public static void main(String args[])
	{
		String data;
		try
		{
		
		FileWriter obj1=new FileWriter("sample.txt");
		obj1.write("good\nmorning");
		System.out.println("File created succcessfully");
		obj1.close();

System.out.println("\nFile content");
		File obj2=new File("sample.txt");
		Scanner sc=new Scanner(obj2);
		while(sc.hasNextLine())
		{
			data=sc.nextLine();
			System.out.println(data);
		}
	}
	catch(Exception e)
	{

	}

	}
}