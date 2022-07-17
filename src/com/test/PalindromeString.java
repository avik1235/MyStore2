package com.test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter a number:");
		System.out.println("Enter a string");
		String str1=sc.next();
		String org_str=str1;
      // String str1="BOOB";
		
		String rev=" ";
		int len=str1.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		
		System.out.println(rev);
		if(str1.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
