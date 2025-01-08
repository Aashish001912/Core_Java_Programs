package Car_related_custom_exception;

@SuppressWarnings("serial")
public class CarStoppedException  extends Exception
{
	public CarStoppedException()
	{
		
	}
	public CarStoppedException(String errorMessage)
	{
		super(errorMessage);
	}
   
}
