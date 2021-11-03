package Design_Pattern.Behavioural_Design_Pattern;

class Loan
{
	private int amount;
	public Loan(int amount)
	{
		this.amount = amount;
	}
	public int getAmount()
	{
		return this.amount;
	}
}

abstract class LoanApproval
{
	protected LoanApproval nextLoanApproval;
	
	public void setNextLoanApproval(LoanApproval nexLoanApproval)
	{
		this.nextLoanApproval = nexLoanApproval;
	}
	public abstract void approvalLoan(Loan loan);
}

//if loan amount less than equal to 100k then manager will approved
//if loan amount less than equal to 250k then director will approved
//if loan amount greater than 250k then vice president will approved

class Manager extends LoanApproval
{

	@Override
	public void approvalLoan(Loan loan) {
		
		if(loan.getAmount()<=100000)
		{
			System.out.println("Approved by Manager");
		}
		else
		{
			nextLoanApproval.approvalLoan(loan);
		}
	}
	
}

class Director extends LoanApproval
{

	@Override
	public void approvalLoan(Loan loan) {
		
		if(loan.getAmount()<=250000)
		{
			System.out.println("Approved by Director");
		}
		else
		{
			nextLoanApproval.approvalLoan(loan);
		}
	}
	
}

class VP extends LoanApproval
{

	@Override
	public void approvalLoan(Loan loan) {
		
		System.out.println("Approved by VP");
		
	}
	
}

public class ChainOfResponsibilities {

	public static void main(String[] args) {
		
		LoanApproval m = new Manager();
		LoanApproval d = new Director();
		LoanApproval v = new VP();
		
		m.setNextLoanApproval(d);
		d.setNextLoanApproval(v);
		
		m.approvalLoan(new Loan(150000));
	}

}
