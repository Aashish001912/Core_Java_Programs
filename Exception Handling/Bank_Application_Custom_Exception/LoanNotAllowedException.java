package Bank_Application_Custom_Exception;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends RuntimeException
{
    public LoanNotAllowedException()
    {
		  
    }
    public LoanNotAllowedException(String errorMessage)
    {
	  super(errorMessage);
    }
}
