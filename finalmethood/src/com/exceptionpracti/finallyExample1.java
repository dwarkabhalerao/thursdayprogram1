package com.exceptionpracti;

public class finallyExample1 {

	public static void main(String[] args) {
		//finally with no exception occured
		System.out.println("finally with no excrption occured");
		try
		{
			int a[]= {1,2,3,4};
			System.out.println(a[1]);
			
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
             System.out.println("Array IndexOut Of Bounds Exception ");
             
		}
		finally
		{
			System.out.println("finally always executed even when exception doesnot occur");
		}
		//finally with exception handled
		System.out.println("----------------------------------------------------------------------------------------------");
		try
		{
			int a[]= {1,2,3,4};
			System.out.println(a[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array IndexOut Of Bounds Exception ");
            	
		}
		finally
		{
			System.out.println("finally always executed even exception handled or not ");
		}
	}

}
