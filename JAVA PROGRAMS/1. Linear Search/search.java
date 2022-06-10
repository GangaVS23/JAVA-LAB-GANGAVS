

import java.util.Scanner;
class search{
	public static void main(String args[]){
		System.out.println();
		System.out.println("...Program to search an element in an array...");
		System.out.println();
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n=sc.nextInt();
		int number[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0; i < n; i++)
        {
            number[i] = sc.nextInt();
        }
		
		System.out.println("Enter the element to search : ");
		int e=sc.nextInt();
		
		for (int i=0;i<n;i++){
			if(number[i]==e)
				flag=1;
		}
		if(flag==1)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}

}