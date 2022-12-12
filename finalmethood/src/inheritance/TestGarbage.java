package com.Inheritance;

public class TestGarbage {
protected void finalize()
	{
		System.out.println("object is garbage collection");
	}
	public static void main(String[] args) {
		TestGarbage t=new TestGarbage();
		TestGarbage t=new TestGarbage();
		t=null;
		t=null;
		System.gc();
	}

}
