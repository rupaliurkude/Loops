package com.qa.Loops;

public class Pattern 
{
public static void pattern(int n)
{
		for(int i =0;i<6;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}

 public static void main(String[] args) 
{	
	 pattern(6);

}

}
