package java_fundamental;

class AccessAccount
{
	private double balance = 10000;
	private String username = "rishabh";
	private String password = "123";
	
	public double getWalletBalance(String username ,String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
			return balance;
		else
			return 0.0;
	}
}

class Data_Hiding
{
	public static void main(String ar[])
	{
		AccessAccount dh= new AccessAccount();
		System.out.println(dh.getWalletBalance("rishabh", "123"));
	}
}