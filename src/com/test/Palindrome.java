package com.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num=sc.nextInt();//1234
		int org_num=num;
	
	
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
	if(num==rev)
	{
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not palindrome number");
	}
	}

}