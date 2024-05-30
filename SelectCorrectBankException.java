package Bank;

public class SelectCorrectBankException extends RuntimeException
{

	@Override
	public String getMessage() {
		
		return "Please Select Appropriate Bank Account to Continue...";
	}

	

}
