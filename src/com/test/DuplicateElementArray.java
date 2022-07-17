package com.test;

public class DuplicateElementArray {

	public static void main(String[] args) {
	
		String arr[]= {"java","c","c++","Python","java"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("found duplicate elements.."+arr[i]);
					flag=true;
				}
			}
		}

         if(flag==false)
           {
	         System.out.println("duplicate elements not found");
           }
	
		
	}

}
