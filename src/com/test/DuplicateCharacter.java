package com.test;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str=new String("automation");
		//char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;       
				}
			}
		}
		System.out.println(count);
		
	}

}
