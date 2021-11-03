package java_fundamental;

class Vehicle
{
	public void run()
	{
		System.out.println("vehicle is running");
	}
}

class Car extends Vehicle
{
	public void run()
	{
		System.out.println("car is running");
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		v.run();
		
		Car c = new Car();
		c.run();
		
		Vehicle ve = new Car();
		ve.run();
		
		//Car car = new Vehicle();
		//car.run();
	}

}
