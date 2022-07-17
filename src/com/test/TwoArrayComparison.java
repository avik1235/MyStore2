package com.test;

import java.util.Arrays;

public class TwoArrayComparison {

	public static void main(String[] args)
	{
		
		//approch 1
		int a[]= {10,11,15,20,25,30,36};
		int b[]= {10,11,15,20,25,30,37};
		
		/*boolean status= Arrays.equals(a,b);
		if(status==true)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		*/
		//approch 2
		boolean status =true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
				else
				{
					status=true;
				}
		     }
		}
		else
    	{
		  status=false;	
	     }
		
		if(status==true)
			{
			System.out.println("arrays are equal");
			}
		else
		{
			System.out.println("arrays are not equal");
		}
	}
}
