package Car_related_custom_exception;

@SuppressWarnings("serial")
public class CarPunctureException extends Exception
{ 
	public CarPunctureException()
	{
		
	}
	public CarPunctureException(String errorMessage)
	{
		super(errorMessage);
		
	}

}
