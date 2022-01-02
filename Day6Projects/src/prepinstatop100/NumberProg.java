package prepinstatop100;

import java.util.Scanner;

public class NumberProg 
{
	public static void main(String[] args) 
	{
		//1)java program to check whether the number entered by the user is positive or negative.
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("The number is positive");
		}
		else if(n<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		
	}
}
