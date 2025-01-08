package Car_related_custom_exception;

@SuppressWarnings("serial")
public class CarHeatException extends Exception
{
  public CarHeatException()
  {
	  
  }
  public CarHeatException(String errorMessage)
  {
	  super(errorMessage);
  }
}
