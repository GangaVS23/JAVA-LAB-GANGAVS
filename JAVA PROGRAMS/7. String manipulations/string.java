//string manipulaton

import java.util.Scanner;
public class string
{
	public static void main(String args[]){
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string1 : ");
	s1=sc.next();
	System.out.println("Enter string2 : ");
	s2=sc.next();
	System.out.println("1.Uppercase of string1 : "+s1.toUpperCase());
	System.out.println("2.Lowercase of string1 : "+s1.toLowerCase());
	System.out.println("3.Substring of string1 from index 2 to 5 : "+s1.substring(2,5));
	System.out.println("4.Length of string1 : "+s1.length());
	System.out.println("5.Index of 't' in string1 : "+s1.indexOf('t'));
	System.out.println("6.Replace 'n' by 'm' in string2 : "+s2.replace('n','m'));
	System.out.println("7.Concatenate string2 to string1 : "+s1.concat(s2));
	System.out.println("8.CompareTo function :"+s1.compareTo(s2));
	System.out.println("9.Whether both the strings are equal : "+s1.equals(s2));
	System.out.println("10.Whether the string2 contains 'nga' : "+s2.contains("nga"));
	System.out.println("11.Character at index 0 of string1 : "+s1.charAt(0));
	
}
}