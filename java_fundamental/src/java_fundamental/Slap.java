package java_fundamental;

public class Slap {

	public static void main(String[] args) 
	{
		getDetailsAndMail();
	}
	
	public static void getDetailsAndMail()
	{
		// code to fetch details from database
		System.out.println("fetching details from database");
		String details="details";
		emailTheUser(details);
	}
	
	public static void emailTheUser(String details)
	{
		// code to email the user
		System.out.println("mailing to the user with message : "+details);
	}

}
