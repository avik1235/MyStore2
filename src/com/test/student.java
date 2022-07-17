package com.test;

class Animal{
	void eat() {
		System.out.print("void eating....");
	}
}
	class Dog extends Animal{
		void bark() {
			System.out.print("barking.....");
		}
	}
		class Cat extends Animal{
			void meow() {
			System.out.print("meowing....");
		}
		}
		class student{
			public static void main(String[] args) {
				
		Cat c1=new Cat();
		c1.eat();
		c1.meow();
		Dog d1=new Dog();
		d1.bark();
		d1.eat();
	}
}