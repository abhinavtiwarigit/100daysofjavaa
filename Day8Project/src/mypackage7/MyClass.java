package mypackage7;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		// sum and avg of array
		
		//declare an array
		Scanner sc = new Scanner(System.in);
		int[]  data = new int[5];
		int sum=0,avg;
		
		//read numbers from user
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter the number:");
			data[i]=sc.nextInt();
		}
		
		//find sum
		for(var d: data)
		{
			sum=sum+d;
		}
		//find avg
		avg=sum/5;
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+avg);
	}

}
