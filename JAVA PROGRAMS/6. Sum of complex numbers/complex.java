import java.util.Scanner;
class sum{
		int a,b;
		void insert(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part of the number : ");
		a=sc.nextInt();
		System.out.println("Enter the imaginary part of the number : ");
		b=sc.nextInt();
		System.out.println("The complex number is : "+a+"+"+b+"i");
		}
}
class complex{
	public static void main(String args[]){
		System.out.println();
		System.out.println("...Program to add two complex numbers...");
		System.out.println();
		
		sum o1=new sum();
		System.out.println("Enter the details of first complex number :");
		o1.insert();
		int x1=o1.a;
		int x2=o1.b;
		System.out.println();
		sum o2=new sum();
		System.out.println("Enter the details of second complex number :");
		o2.insert();
		int y1=o2.a;
		int y2=o2.b;
		System.out.println();
		int m=x1+y1;
		int n=x2+y2;
		System.out.println("Sum of the complex numbers is : "+m+"+"+n+"i");
		}
}