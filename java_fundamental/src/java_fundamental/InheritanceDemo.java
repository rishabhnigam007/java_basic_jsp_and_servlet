package java_fundamental;

//single inheritance  this is only parent child relationship
// parent class
class A
{
	
}

// child class
class B extends A
{
	
}

//multilevel inheritance
class C extends B
{
	
}

// multiple inheritance : More than 1 parent
interface AA
{
	default void method()
	{
		System.out.println("this is default method of AA");
	}
}
interface BB
{
	default void method()
	{
		System.out.println("this is default method of BB");
	}
}
class CC implements AA,BB
{

	@Override
	public void method() {
		BB.super.method();
	}
	
}

// Hierarchical inheritance : A -> B, DD single parent, more than one children
class DD extends A implements AA,BB
{

	@Override
	public void method() {
		AA.super.method();
		BB.super.method();
	}
	
}

// hybrid : multiple inheritance + multilevel inheritance


public class InheritanceDemo 
{

	public static void main(String[] args)
	{
		// IS-A relationship is a parent->child relationship
		/*
		 * There are five type of inheritance :
		 * 1. single inheritance
		 * 2. multilevel inheritance
		 * 3. multiple inheritance  // DIAMOND AMBIGUITY PROBLEM // using through Interface
		 * 4. hierarchical inheritance
		 * 5. hybrid inheritance
		 * */
	}

}