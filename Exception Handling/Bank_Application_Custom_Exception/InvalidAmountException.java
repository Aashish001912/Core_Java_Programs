package Bank_Application_Custom_Exception;

@SuppressWarnings("serial")
public class InvalidAmountException extends RuntimeException
{
  public InvalidAmountException()
  {
	  
  }
  public InvalidAmountException(String errorMessage)
  {
 	 super(errorMessage);
  }
}
