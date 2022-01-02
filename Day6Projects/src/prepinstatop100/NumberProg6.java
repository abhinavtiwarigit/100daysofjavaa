package prepinstatop100;

import java.util.Scanner;

public class NumberProg6 
{
	public static void main(String[] args)
	{
		//6)Greatest of the Three numbers
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		System.out.println("Enter the third number:");
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println(a+" is greatest");
		else if(b>a && b>c)
			System.out.println(b+" is greatest");
		else if(c>a && c>b)
			System.out.println(c+" is greatest");
		else
			System.out.println("All three are equal");
	}
}
