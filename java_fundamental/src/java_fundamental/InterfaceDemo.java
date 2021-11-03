package java_fundamental;

public interface InterfaceDemo 
{
	static final String a = "static constant";
	
	public void m1();
	
	public int m2();
	
	//we can use private modifier here
	static void m3() {}
	
	// we can not use private modifier with default method
	//this is comes after java 9 
	default int m4() { return 0; }
	
	//we can make private method using private modifier
	//private void m5() {}
	
}

// if we want not to implemented all abstract method of interface so define your class abstract

class Testing implements InterfaceDemo
{

	@Override
	public void m1() 
	{
		System.out.println("this is a method 1");
	}

	@Override
	public int m2() 
	{
		System.out.println("this is a method 2");
		return 0;
	}
	
}