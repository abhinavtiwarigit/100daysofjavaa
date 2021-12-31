package mypackage;

public abstract class Salary
{
	public int PF(int basic)
	{
		return 12*100/basic;
	}
	public int HRA(int basic)
	{
		return 40*100/basic;
	}
	public abstract int SA();
	
	public abstract int TA();
	
}
 class MicrosoftSalary extends Salary //The type MicrosoftSalary must implement the inherited abstract method Salary.SA()
{

	@Override
	public int SA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int TA() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class CognizantSalary
{
	public int PF(int basic)
	{
		return 12*100/basic;
	}
	public int HRA(int basic)
	{
		return 40*100/basic;
	}
	public int SA()
	{
		return 10000;
	}
	public int TA()
	{
		return 1500;
	}
}
class Infosys
{
	public int PF(int basic)
	{
		return 12*100/basic;
	}
	public int HRA(int basic)
	{
		return 40*100/basic;
	}
	public int SA()
	{
		return 30000;
	}
	
}