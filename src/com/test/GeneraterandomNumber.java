package com.test;

import java.util.Random;

public class GeneraterandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rad=new Random();
		int rand_int=rad.nextInt(10);
		System.out.println(rand_int);
		
		double rand_double=rad.nextDouble();//range 0.00 and less than 1.0
		System.out.println(rand_double);
		
		//approch 2-math
		System.out.println(Math.random());
		
		//approch3-Apache common-lang API
		
		
		
		
	}

}
