package Bank_Application_Custom_Exception;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception
{
  public AccountNotFoundException()
  {
	  
  }
  public AccountNotFoundException(String errorMessage)
  {
	  super(errorMessage);
  }
}
