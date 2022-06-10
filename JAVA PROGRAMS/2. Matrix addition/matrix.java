import java.util.Scanner;
class matrix{
	public static void main(String args[]){
		System.out.println();
		System.out.println("...Program to add two matrices...");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows of 1st matrix : ");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns of 1st matrix : ");
		int c=sc.nextInt();
		
		System.out.println("Enter the number of rows of 2nd matrix : ");
		int l=sc.nextInt();
		System.out.println("Enter the number of columns of 2nd matrix : ");
		int k=sc.nextInt();
		
		if(r==l && c==k)
		{
			
		int m[][]=new int[r][c];
		int n[][]=new int[l][k];
		
		System.out.println("Enter the elements of first matrix : ");
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
        {
            m[i][j] = sc.nextInt();
        }
        }
		
		System.out.println("Enter the elements of second matrix : ");
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
        {
            n[i][j] = sc.nextInt();	
        }
        }
		
		System.out.println("Sum of the matrices is : ");
		int nm[][]=new int[r][c];
		for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
        {
            nm[i][j] = m[i][j] + n[i][j];
			System.out.print(nm[i][j]+" ");
        }
		System.out.println();
        }
		}
		else
			System.out.println("Addition not possible");
	}
}