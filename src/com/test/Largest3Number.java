package com.test;

import java.util.Scanner;

public class Largest3Number {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
       System.out.println("Enter first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		
		System.out.println("Enter third number:");
		int c=sc.nextInt();
		
		/*if(a>b && a>c)
			
		{
			System.out.println("a is largest");
		}
		else if(b>a && b>c)
			
		{
			System.out.println("b is largest");
		}
   else if(c>a && c>b)
			
		{
			System.out.println("c is largest");
		}
		*/
		
		//2 using ternary operator
		int largest=a>b?a:b;          //largest of a and b
		 largest=c>largest?c:largest;
		 System.out.println("largest is"+largest);
		



	}

}
