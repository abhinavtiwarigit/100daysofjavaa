package prepinstatop100;

import java.util.Scanner;

public class NumberProg11 
{

	public static void main(String[] args) 
	{
		//11)sum of digits entered
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits:");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int picklast=n%10;
			sum=sum+picklast;
			n=n/10;
		}
		System.out.println("The sum is "+sum);

	}

}
