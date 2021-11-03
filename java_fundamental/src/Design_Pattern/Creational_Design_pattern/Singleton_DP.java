package Design_Pattern.Creational_Design_pattern;

class Singleton
{
	static Singleton s = new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		System.out.println("new instance is created !!");
		return s;
	}
}

public class Singleton_DP {
	
	public static void main(String[] args) {
		
		// when you call this method then only instance is created
		
		@SuppressWarnings("unused")
		Singleton ss = Singleton.getInstance();
		/* ss.toString(); */
		
	}

}
