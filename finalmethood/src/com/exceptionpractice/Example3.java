package com.exceptionpractice;

public class Example3 {

	public static void main(String[] args) {
		try
		{
			int a[]= {10,20,30,40,50};
			System.out.println(a[8]);
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	//System.out.println(e);
        	System.out.println("ArrayIndex Out of Bound Exception ");
		}
		System.out.println("rest of the code");
	}

}
