package com.qa.Loops;

public class FizzNBuzz 
{	
	public void fizz_buzz(int n)
	{
			if(n%3==0 && n% 5==0)
			{
				System.out.println("Fizz And Buzz");
			}
			 else if  (n%3==0)
			{
				System.out.println("Buzz");
			}
			else if(n%5 ==0)
			{
				System.out.println("Fizz and Buzz");
			}
			else
			{
				System.out.print(n);
			}
		}
	

	public static void main(String[] args) 
	{
		FizzNBuzz fb = new FizzNBuzz ();
		fb.fizz_buzz(3);
	}

}
