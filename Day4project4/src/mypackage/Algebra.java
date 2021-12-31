package mypackage;

public class Algebra 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)		// Same method name diff parameters we call it as polymorphism
	{										//METHOD OVERLOADING
		return a+b+c;
	}
	public int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
}
