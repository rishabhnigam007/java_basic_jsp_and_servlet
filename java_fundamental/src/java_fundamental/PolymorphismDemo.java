package java_fundamental;

class Addition
{
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args)
	{
		Addition add = new Addition();
		add.sum(2,4);
		add.sum(2, 5,9);
		add.sum(10.25, 10.5);
		add.sum(10.25f, 20.5);
		
		// float can change implicitly convert to double
		
		//byte -> short -> int -> float -> double
		//                  ^
		//                  |
		//                 char
		
	}

}
