package com.test;

public class SumDigit {

	public static void main(String[] args) {
		int a=1234;
		int rev=0;
		while(a>0)
		{
			
			rev=rev+a%10;
			a=a/10;
		}
		System.out.println(rev);

	}

}
