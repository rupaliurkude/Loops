package com.qa.Loops;
//01123
public class FibonaciSeries 
{ 	int fibo ;
	int fibo1=0;
	int fibo2=1;
	public void my_fibo(int n)
	{
		for(int i=0;i<n;i++)
		{
			fibo =fibo1+fibo2;
				System.out.print(fibo1);
				fibo1=fibo2;
				fibo2=fibo;

		}
	}

	public static void main(String[] args) 
	{
		FibonaciSeries f = new FibonaciSeries();
		f.my_fibo(5);
	}

}
