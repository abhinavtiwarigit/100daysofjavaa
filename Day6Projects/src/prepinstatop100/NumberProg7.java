package prepinstatop100;

import java.util.Scanner;

public class NumberProg7 
{
	public static void main(String[] args)
	{
		//7)Leap year or not
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		year=sc.nextInt();
		if((year% 4==0 && year%100!=0) || year%400==0)
		System.out.println("the year "+year+" is leap year");
		else
			System.out.println("The year "+year+" is not a leap year");
	}
}
