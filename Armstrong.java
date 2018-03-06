package com.qa.Loops;
//153 =(1*3)+(5*3)+(3*3)
public class Armstrong 
{
	int c = 0,a,temp;
	int n = 153;//its the number to check amstrong.
	public  void arm(int n )
 {
	 for(int i =0;i<n;i++)
	 {
		 temp = n;
			while (n>0)
			{
				a = n%10;
				n=n/10;
				c=c+(a*a*a);
			}
		if(temp==c){
		 System.out.println("Armstrong number");
		}else{
			System.out.println("Not armstrong");
	 }
		
	 }
 }
	public static void main(String[] args) 
	{
		 Armstrong a = new  Armstrong();
		 	a.arm(123);
	}

}
