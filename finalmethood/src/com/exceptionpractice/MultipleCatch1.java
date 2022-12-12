package com.exceptionpractice;

public class MultipleCatch1 {

	public static void main(String[] args) {
	try
	{
		//int result=100/0
		int a[]=new int[10];
		System.out.println(a[20]);
		
	}
       
    catch(ArithmethicExceptipon e)
	{
         System.out.println("artimetic exception occured");
         
	}
	catch(ArrayIndexOutOfBoundException e)
	{
		 System.out.println("ArrayIndex Out of Bound Exception occured");
		 
	}
	catch(Exception e)
	{
          System.out.println("exception handled by parent exception");
	}
	       System.out.println("remaining part of the program");
	}      
}
