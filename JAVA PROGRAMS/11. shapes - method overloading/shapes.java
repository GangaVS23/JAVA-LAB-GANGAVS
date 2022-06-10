 class areas
{
	void area(int a,int b)
		{
		System.out.println("Area of the rectangle  :"+a*b);
		}
	void area(double a)
		{
		System.out.println("Area of the circle   :"+3.14*a);
		}
	void  area(double  a,double  b)
		{
		System.out.println("Area of the triangle :"+.5*a*b);
		}
	void  area(int a)
		{
		System.out.println("Area of the square  :"+a*a);
		}
}

public class shapes{		
	public static void main(String[] args){
		areas x = new areas();
		x.area(2,4);
		x.area(4.0);
		x.area(2.0,4.0);
		x.area(2);
	}
}