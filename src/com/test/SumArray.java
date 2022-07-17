package com.test;

import java.sql.Array;

public class SumArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		int sum=0;
	/*for(int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
	}
		
		System.out.println(sum);
		
	}*/
	
	//enhanced for loop
	for(int value:a)
	{
		sum=sum+value;
	}
	System.out.println(sum);

}
}