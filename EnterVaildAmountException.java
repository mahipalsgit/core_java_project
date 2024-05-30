package Bank;

public class EnterVaildAmountException extends RuntimeException
{

	@Override
	public String getMessage() {
		
		return "Please Enter valid Amount to process...";
	}

}
