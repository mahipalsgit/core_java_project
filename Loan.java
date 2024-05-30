package BANKING;

import Bank.EnterVaildAmountException;
import Bank.InsufficientFundsException;

public class Loan extends Account implements AccountOperations
{
	private double bal;
	private static String accNo;
	
	
	//constructor
	public Loan( String name, long mobNo) {
		super(name, mobNo);
		accNo=getAccNo();
		System.out.println("Your Account no is:"+accNo);
	}
	
	public String getAccNo() {
		String s=getMobNo()+"";
		return "Loan@"+s.substring(0, 3)+"A"+s.substring(s.length()-5);
	}

	

	
	@Override
	public void withdraw(double amt) 
	{
		String action="Debited";
		if(amt>bal)
		{
			throw new InsufficientFundsException();
		}else
		{
			bal-=amt;
			balanceMessage(amt,action);
		}
		
		
	}

	public void balanceMessage(double amt, String action) {
		System.out.println("Dear Customer your A/c has "+action+" for Rs."+amt+" Avl Bal is"+bal);
		
	}

	@Override
	public void deposit(double amt) 
	{
		String action="Credited";
		if(amt<=0)
		{
			throw new EnterVaildAmountException();
		}else
		{
			bal+=amt;
			balanceMessage(amt,action);
		}
		
		
	}

	@Override
	public void checkBal() 
	{
		System.out.println("Account Balance is: Rs."+bal);
		
		
	}

	

}
