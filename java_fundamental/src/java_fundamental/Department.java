package java_fundamental;

public abstract class Department
{
	public abstract int getEmployee();
	
	public abstract void method();
	
	public void attendance()
	{
		System.out.println("I am present");
	}
	
	static int a = 0;
	//int c=0;
	static void displayValue()
	{
		System.out.println("the value for static variable a  is : "+a);
	}
}

class DeptOne extends Department
{

	@Override
	public int getEmployee() {
		return 100;
	}

	@Override
	public void method() {
		System.out.println("This is implimentation of method");
	}
	
}