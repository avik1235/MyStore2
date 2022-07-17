package com.test;

public class SearchingElementArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search_ele=50;
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("matching element is.."+i+a[i]);
			}
		}
		

	}

}
