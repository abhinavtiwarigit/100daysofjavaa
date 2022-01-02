package prepinstatop100;

import java.util.Scanner;

public class NumberProg5 
{
	public static void main(String[] args) 
	{
		//5)Greatest of two numbers
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println(+a+" is equal to "+b);
		}
		else if(a>b)
		{
			System.out.println(+a+" is greater than "+b);
		}
		else
		{
			System.out.println(+b+" is greater than "+a);
		}

	}
}
