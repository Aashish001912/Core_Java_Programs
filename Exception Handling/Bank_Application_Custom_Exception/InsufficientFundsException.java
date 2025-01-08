package Bank_Application_Custom_Exception;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception
{
 public InsufficientFundsException()
 {
	 
 }
 public InsufficientFundsException(String errorMessage)
 {
	 super(errorMessage);
 }
}
