import java.util.Scanner;
class symmetric{
	public static void main(String args[]){
		System.out.println();
		System.out.println("...Program to check whether a matrix is symmetric or not...");
		System.out.println();
		int flag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int c=sc.nextInt();
		if(r==c)
		{
			int m[][]=new int[r][r];
			System.out.println("Enter elements of the matrix : ");
			for(int i = 0; i < r; i++)
			{
				for(int j = 0; j < r; j++)
				{
					m[i][j] = sc.nextInt();
				}
			}
			
			int n[][]=new int[r][r];
			for(int i = 0; i < r; i++)
			{
				for(int j = 0; j < r; j++)
				{
					n[i][j] = m[j][i];
				}
			}
			
			System.out.println("Transpose matrix : ");
			for(int i = 0; i < r; i++)
			{
				for(int j = 0; j < r; j++)
				{
					System.out.print(n[i][j]+" ");
				}
			System.out.println();
			}
			
			for(int i = 0; i < r; i++)
			{
				for(int j = 0; j < r; j++)
				{
					if(m[i][j]==n[i][j])
						flag=flag+1;	
				}
			}
		}
		
		if(flag==r*r)
			System.out.println("This is a symmetric matrix");
		else
			System.out.println("This is not a symmetric matrix");
}
}