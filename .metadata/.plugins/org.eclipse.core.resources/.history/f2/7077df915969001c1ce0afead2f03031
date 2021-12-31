package package1;

public class MyPackage1BaseClass 
{
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void myPackage1BaseClassMethod()
	{
		a=1;
		b=2;
		c=3;
		d=4;
				
	}
}
class MyPackage1DerivedClass extends MyPackage1BaseClass
{
	public void myPackage1DerivedClassMethod()
	{
		a=1;
		b=2;	// private not accessible 
		c=3;
		d=4;
				
	}
}
class MyPackage1OtherClass 
{
	public void myPackage1DerivedClassMethod()
	{
		MyPackage1BaseClass obj = new MyPackage1BaseClass() ;
		obj.a=1;
		obj.b=2;	 // private not accessible
		obj.c=3;
		obj.d=4;
				
	}
}