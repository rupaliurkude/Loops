package com.qa.Loops;

public class Swap 
{	 
	
	public static void swap_without()
	{
		int a=10;
		int b=20;
		System.out.println("before swap a:"+ a+",b:"+ b);

		a=a+b;//30
		b=a-b;//10
		a= a-b;//20
		System.out.print("after swap a:"+ a +",b:"+ b);
	}
	public static void with_temp()
	{

		int temp;
		int a =10;
		int b=20;
		System.out.println("before swap a:"+ a+",b:"+ b);
		temp=b;//temp=10
		b=a;//b=10
		a=temp;//a=20
		System.out.print( "after a: "+ a+", b:"+ b);
	}
	public static void main(String[] args) 
	{
		swap_without();
		System.out.println("");
		with_temp();
	}

}
