package com.test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class StringSplit {

	public static void main(String[] args) {
		String s1="I am a Automation Engineer";
		
		String [] arr=s1.split(" ");
	
		String rev=" ";
	
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.println(arr[i]);
			rev=rev+arr[i];
			
			
		}
		
		System.out.println(rev);
		
	}

}
