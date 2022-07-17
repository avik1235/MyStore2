package com.test;

class A{
	public void run() {
		System.out.println("running");
	}
}
class B extends A{
	public void run()
	{
		System.out.println("walking");
	}

}

public class Bab  {
	
	public static void main(String[] args) {
		B b=new B();
		b.run();

	}

}
