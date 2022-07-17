package com.test;

public class EvenoddCount {

	public static void main(String[] args) {
	int n=731222385;
	int evencount=0;
	int oddcount=0;
	
	while(n>0)
	{
		//int rem=0;
		
		if(n%2==0)
		{
			evencount++;
			
		}
		else 
		{
			oddcount++;
		}
	n=n/10;
	
		
	}
	System.out.println("even num"+evencount);
	System.out.println("odd numb"+oddcount);
	}
	

}
