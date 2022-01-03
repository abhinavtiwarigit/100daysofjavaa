package prepinstatop100;

import java.util.Scanner;

public class NumberProg9 
{
	public static void main(String[] args) 
	{
		//9)Prime number in range
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int start=sc.nextInt();
		System.out.println("Enter the Ending number:");
		int end=sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		int count;
		for(int i=start;i<=end;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count=count+1;
			}
			if(count==2)
				System.out.println(i);
		}
				

	}
}
