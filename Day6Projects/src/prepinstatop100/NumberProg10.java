package prepinstatop100;

import java.util.Scanner;

public class NumberProg10 
{

	public static void main(String[] args) 
	{
		//10)Factorial of a number
		Scanner sc = new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("The factorial of "+n+" is:"+fact);

	}

}
