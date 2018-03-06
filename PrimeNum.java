package com.qa.Loops;

public class PrimeNum 
{
	public static void prime_num(int n)
	{
		boolean is_Prime = true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
			is_Prime=false;
			break;
			}
		}
	if(is_Prime)
	{
		System.out.println("Is Prime");
	}
	else
	{
		System.out.println("Is Not Prime");
	}
	
	
}
	public static void main(String[] args) 
	{
		prime_num( 7);
	}

}
