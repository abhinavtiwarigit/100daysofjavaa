package prepinstatop100;

import java.util.Scanner;

public class NumberProg3 
{
	public static void main(String[] args) 
	{
		//3)Sum of First N Natural numbers
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the natural number n");
		n =  sc.nextInt();
		if(n<0 || n==0)
			System.out.println("the entered number is not natural");
		else 
		{
			for(int i=0;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("The sum of first " +n+" natural number is "+sum);

		}
		
	}
}
