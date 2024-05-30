package BANKING;

import java.util.Scanner;

import Bank.SelectCorrectBankException;

public class Exe 
{
	public static void main(String[] args) 
	{
		System.out.println("Choose Account Type \n 1.LOAN \n 2.SAVINGS \n 3.CURRENT");
		
		Scanner s=new Scanner(System.in);
		System.out.print("Choose Acc: ");
		int option=s.nextInt();
		System.out.println("---------------------------");
		System.out.print("Enter Your Name: ");
		String name=s.next();
		System.out.print("Enter your PHNO: ");
		long phno=s.nextLong();
		System.out.println();
		
		Bank b=new Bank();
		if(option==1)
		{
			b.createAccount(name, phno, "Loan");
			System.out.println(b.otp());
			
		}
		else if(option==2||option==3)
		{
			if(option==2)
			{
				b.createAccount(name, phno,"Savings");
				System.out.println(b.otp());
			}
			else
			{
				b.createAccount(name, phno,"Current");
				System.out.println(b.otp());
			}
		}
		else
		{
			throw new SelectCorrectBankException();
		}
		System.out.println("------------------------------------");
		System.out.print("Enter your acount number: ");
		String accNo=s.next();
		System.out.print("enter your otp have sent to your mobile: ");
		int otp=s.nextInt();
		boolean flag=b.login(accNo, otp);
		if(flag==true)
		{
			System.out.println("LOGIN SUSCESS!!..");
			Account a1=b.currAccount();
//////////////////////////////////////////////////////////////////////////////
			if(a1 instanceof Savings)
			{
				Savings sav=(Savings)a1;
				System.out.println("Choose Opertaion \n1.deposit \n2.withdraw \n3.balanceEnquiry ");
				System.out.print("Enter operation: ");
				int bankop=s.nextInt();
				if(bankop<=4)
				{
					while(bankop!=4)
					{
						System.out.println("Enter amount: ");
						double amt=s.nextDouble();
						if(bankop==1)
						{
							sav.deposit(amt);
							System.out.println("DEPOSIT SUCESS!!..");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else if(bankop==2)
						{
							sav.withdraw(amt);
							System.out.println("WITHDRAW SUCESS!!..");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else if(bankop==3)
						{
							sav.checkBal();
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else
						{
							System.out.println("Enter valid operation!!");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
					}
					
				}
				
				
			}
	////////////////////////////////////////////////////////////////////////
			else if(a1 instanceof Loan)
			{
				Loan loan=(Loan)a1;
				System.out.println("Choose Opertaion \n1.deposit \n2.withdraw \n3.balanceEnquiry \n4.Exit");
				System.out.print("Enter operation: ");
				int bankop=s.nextInt();
				if(bankop<=4)
				{
					while(bankop!=4)
					{
						System.out.println("Enter amount: ");
						double amt=s.nextDouble();
						if(bankop==1)
						{
							loan.deposit(amt);
							System.out.println("DEPOSIT SUCESS!!..");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else if(bankop==2)
						{
							loan.withdraw(amt);
							System.out.println("WITHDRAW SUCESS!!..");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else if(bankop==3)
						{
							loan.checkBal();
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else
						{
							System.out.println("Enter valid operation!!");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
					}
					
				}
				

			}
////////////////////////////////////////////////////////////////////////////////////
			else
			{
				Current curr=(Current)a1;
				System.out.println("Choose Opertaion \n1.deposit \n2.withdraw \n3.balanceEnquiry \n4.Exit");
				System.out.print("Enter operation: ");
				int bankop=s.nextInt();
				if(bankop<=4)
				{
					while(bankop!=4)
					{
						System.out.println("Enter amount: ");
						double amt=s.nextDouble();
						if(bankop==1)
						{
							curr.deposit(amt);
							System.out.println("DEPOSIT SUCESS!!..");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else if(bankop==2)
						{
							curr.withdraw(amt);
							System.out.println("WITHDRAW SUCESS!!..");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else if(bankop==3)
						{
							curr.checkBal();
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
						else
						{
							System.out.println("Enter valid operation!!");
							System.out.print("Enter Operation : ");
							bankop=s.nextInt();
						}
					}
					
				}
				

			}
		}
///////////****OUTER IF-ELSE***////////////////////////////
		else
		{
			System.out.println("LOGIN FAILURE try again!!");
		}
		
	s.close();	
		
	}

}
