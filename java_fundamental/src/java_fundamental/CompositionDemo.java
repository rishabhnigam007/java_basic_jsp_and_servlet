package java_fundamental;

class House
{
	private Kitchen kitchen;

	public House() {
		kitchen = new Kitchen();
		kitchen.setFood("pizza");
	}

	public String getFood()
	{
		return kitchen.getFood();
	}
	
}

class Kitchen
{
	private String food;
	public void setFood(String food)
	{
		this.food=food;
	}
	public String getFood()
	{
		return food;
	}
}

public class CompositionDemo
{

	public static void main(String[] args) 
	{
		House house = new House();
		System.out.println(house.getFood());
	}

}
