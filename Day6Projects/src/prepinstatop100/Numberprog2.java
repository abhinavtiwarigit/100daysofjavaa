package prepinstatop100;

import java.util.Scanner;

public class Numberprog2 
{
	public static void main (String[] args)
	{
		//2)Check whether a number is even or odd using Java
		Scanner sc = new Scanner(System.in);
		int  n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else if(n%2==1)
		{
			System.out.println("The number is odd");
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}
