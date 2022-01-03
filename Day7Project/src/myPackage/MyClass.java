package myPackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[ ] Data =new int[] {5,6,7,8,9};
		for(int i=0;i<Data.length;i++)
			System.out.println(Data[i]);
		for(int d:Data)					//for  each integer d in data 
			System.out.println(d);	// d is value present in the array
		String[] names = new String[] {"Cognizant","Accenture","Capgemini"};
		for(String n:names)
			System.out.println(n);
		for(var n:names)		// var is far better
			System.out.println(n);
		

	}
}
