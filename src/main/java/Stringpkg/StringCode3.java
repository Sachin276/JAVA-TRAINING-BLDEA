package Stringpkg;

import java.util.Scanner;

public class StringCode3 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string-1:");
		String str1=sc.next();
		System.out.println("enter the string-2:");
		String str2=sc.next();
		if(str1.equalsIgnoreCase(str2)==true)
		{
			System.out.println("strings are equal");
		}
		else 
		{
			System.out.println("strings are not equal");
		}
	}
		
	

	
}


