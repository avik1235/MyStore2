package com.test;

public class Swap {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before Swap"+a);
		System.out.println("Before Swap"+b);
	//logic 1---using third variable	
	int c=a;
	a=b;
	b=c;
		System.out.println("After Swap"+a);
		System.out.println("After Swap"+b);
		
		//logic 2---using + &-without using 3rd variable
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("After Swap"+a);
		System.out.println("After Swap"+b);

	}

}
