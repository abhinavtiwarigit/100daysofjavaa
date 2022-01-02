package prepinstatop100;

import java.util.Scanner;

public class NumberProg8 
{

	public static void main(String[] args) 
	{
		//8)prime number or not 
		Scanner sc = new Scanner(System.in);
		int n,count=0;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n==1 || n==0)
			System.out.println("not a prime nummber");
		else if(n==2)
			System.out.println("it is a prime number");
		else
		{
			for(int i=2;i<=n;i++)
			{
				if(n%i==0)
				count=count+1;
				break;
			}
			if(count==1)
				System.out.println("Not a prime number");
			else
				System.out.println("it is a prime number");
		}
		
	}

}
