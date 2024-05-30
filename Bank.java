package BANKING;

import java.util.LinkedHashMap;
import java.util.Map;

import Bank.SelectCorrectBankException;

public class Bank {
	
	Map<String, Object> map=new LinkedHashMap<>();
	//Map<String, Integer> otps=new LinkedHashMap<>();
	Account curr;
//	boolean savingsflag=false;
//	boolean currflag=false;
//	boolean loanflag=false;
	String str;
    int otp;
	
	public void createAccount(String name,long phno,String acctype)
	{
		Account a;
		if(acctype.equalsIgnoreCase("Loan"))
		{
			a=new Loan(name, phno);
		}
		
		else if(acctype.equalsIgnoreCase("Savings"))
		{
			a=new Savings(name, phno);
		}
		
		else if(acctype.equalsIgnoreCase("Current"))
		{
			a=new Current(name, phno);
		}
		else
		{
			throw new SelectCorrectBankException();
		}
		if(a instanceof Savings)
		{
			Savings s=(Savings) a;
			str=s.getAccNo();
			map.put(str, a);
		}
		if(a instanceof Loan)
		{
			Loan s=(Loan) a;
			str=s.getAccNo();
			map.put(str, a);
		}
		if(a instanceof Current)
		{
			Current s=(Current) a;
			str=s.getAccNo();
			map.put(str, a);
		}
		
		
		 
	}
	public  int otp()
	{
	    otp=Otp.otpGenerator();
		return otp;
	}
	
	
	
	//login
	public  boolean login(String accNo,int otp)
	{
		if(!map.containsKey(accNo)) return false;
		if(map.containsKey(accNo)&& this.otp!=otp) return false;
		
		if(map.containsKey(accNo)&& this.otp==otp)
		{
			curr=(Account) map.get(accNo);
			return true;
		}
		return false;
	}
	public Account currAccount()
	{
		return curr;
	}
	
	
	
	//static block
	static
	{
		
		System.out.println("Welcome to Bank!....");
		
	}
	//non static block
	{
			
		System.out.println("don't share your otp with others...");
		
	}


}
