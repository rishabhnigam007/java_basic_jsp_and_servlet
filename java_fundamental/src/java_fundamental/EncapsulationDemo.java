package java_fundamental;

class Account
{
	private double balance;
	
	public double getBalance()
	{
		// validation
		if(balance<=0)
		{
			return 0.0;
		}
		
		return balance;
	}
	
	public void setBalance(double balance)
	{
		//validation
		if(balance<=0)
		{
			this.balance=0.0;
		}
		
		this.balance=balance;
	}
}

public class EncapsulationDemo 
{

	public static void main(String[] args) 
	{
		Account a=new Account();
		a.setBalance(180000);
		System.out.println(a.getBalance());
	}

}
