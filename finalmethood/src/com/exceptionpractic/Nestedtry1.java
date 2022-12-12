package com.exceptionpractic;

public class Nestedtry1 {

	public static void main(String[] args) {
		try
		{
			   try
			   {
				   try
				   {
					   int array[]= {10,20,30,40,50,60};
					   System.out.println(array[20]);
				   }
				   catch(ArithmeticException e)
				   {
					   System.out.println("Arithmetic exception of first inner try");
				   }
			   }
               catch(ArithmeticException e)
			   {
            	   System.out.println("Arithmetic exception of second inner try");
			   }
			   }
             catch(ArrayIndexOutOfBoundsException e)
		{
            	 System.out.println(e);
            	 System.out.println("Array index out bound exception of handled through outer try block");
		}
	}

}
