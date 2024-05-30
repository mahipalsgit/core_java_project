package Bank;

public class InsufficientFundsException extends RuntimeException
{
	@Override
	public String getMessage() {
		
		return "try to enter less amount your doesn't have sufficient funds to withdraw";
	}
	

}
