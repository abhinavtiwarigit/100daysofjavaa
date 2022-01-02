package prepinstatop100;

import java.util.Scanner;

public class NumberProg4 
{
	public static void main(String[] args)
	{
		//4)Sum of numbers in a given range
		int m,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		m=sc.nextInt();
		System.out.println("Enter the second number:");
		n=sc.nextInt();
		for(int i=m;i<=n;i++)
			sum=sum+i;
		System.out.println("Sum of natural numbers from "+m+" to "+n+" is "+sum);
		
	}
}
