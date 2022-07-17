package com.test;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[]= {10,11,15,20,25,30,36};
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even no is"+a[i]);
				evencount++;
			}
			else
			{
				System.out.println("odd no is"+a[i]);
				oddcount++;
			}
			}
		System.out.println("even count is.."+evencount);
		System.out.println("odd count is.."+oddcount);
		}

	}


