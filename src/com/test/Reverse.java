package com.test;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();//1234
		//1 algorithm
		
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;//0+1234=4;      4*10+3=43  43*10+2=432 432*10+1=4321
			num=num/10;//123          123/10=12           12/10=1;     1/10=0;            
			
		}
		
		// 2 string Buffer 
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev1=sb.reverse();*/
		
		
     System.out.println("reverse a number"+rev);
	}

}
