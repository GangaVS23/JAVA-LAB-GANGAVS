import java.util.Scanner;

class cpu
{
	Scanner sc=new Scanner(System.in);
	int price;

	void pricecpu()
	{
		System.out.println("\nEnter the price of CPU : ");
		price=sc.nextInt();
	} 

	class processor 
	{
		int ncore;
		String manf;

		void insertprocessor()
		{
			System.out.println("Enter the no of cores of processor : ");
			ncore=sc.nextInt();
			System.out.println("Enter the manufacturer of processor : ");
			manf=sc.next();
		}

		void displayprocessor()
		{
			System.out.println("\n...Details of the processor...");
			System.out.println("No of cores of processor : "+ncore);
			System.out.println("Manufacturer of processor : "+manf);
		}

	}	

	static class ram
	{
		int memory;
		String manf;
		Scanner sc=new Scanner(System.in);
		
		void insertram()
		{
			System.out.println("Enter the memory size(GB) of ram : ");
			memory=sc.nextInt();
			System.out.println("Enter the manufacturer of ram : ");
			manf=sc.next();
		}
		
		void displayram()
		{
			System.out.println("\n...Details of the memory...");
			System.out.println("Memory size of ram : "+memory+"GB");
			System.out.println("Manufacturer of ram : "+manf);
		}

	}

}


public class computer {
public static void main(String args[]){
	cpu c=new cpu();
	cpu.processor p=c.new processor();
	cpu.ram r=new cpu.ram();

	c.pricecpu();
	p.insertprocessor();
	r.insertram();

	
	p.displayprocessor();
	r.displayram();
	}
}