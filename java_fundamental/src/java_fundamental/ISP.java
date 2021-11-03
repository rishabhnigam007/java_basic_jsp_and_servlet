package java_fundamental;

interface Worker
{
	public void work();
}

interface Sleep
{
	public void sleep();
}

class Human implements Worker,Sleep
{

	@Override
	public void work() {
		System.out.println("human are good at work");
	}

	@Override
	public void sleep() {
		System.out.println("human generally take rest");
	}
	
}

class Robot implements Worker
{

	@Override
	public void work() {
		System.out.println("Robot can work without getting tired");
	}
}

public class ISP {

	public static void main(String[] args) {
		Robot r = new Robot();
		r.work();
		
		Human h = new Human();
		h.work();
		h.sleep();
	}

}
