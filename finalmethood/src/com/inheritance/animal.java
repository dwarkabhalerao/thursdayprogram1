package com.inheritance;

public class Animal 
{
	final void bark()
	{
		System.out.println("animal is barking");
	}
	final void shout()
	{
		System.out.println("dog is barking");
	}
	
}
class Dog1 extends Animal
{
	void shout()
	{
		System.out.println("dog is barking");
	}
}
public class FinalMethod{
	

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.dark();
		d.shout();

	}

}
