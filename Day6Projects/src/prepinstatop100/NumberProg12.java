package prepinstatop100;

import java.util.Scanner;

public class NumberProg12 
{

	public static void main(String[] args) 
	{
		//12)rev of a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0)
		{
			int picklast=n%10;
			rev=rev*10+picklast;
			n=n/10;
		}
		System.out.println(rev);
	}

}
