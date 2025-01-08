package Car_related_custom_exception;

public class CarTest
{
  public static void CarStopped(String action) throws CarStoppedException
  {
	  if("stop".equalsIgnoreCase(action))
	  {
		  throw new CarStoppedException("Car are stopped for some reasons");
	  }
	  else 
	  {
		  System.out.println("car not stall");
	  }
  }

  public static void CarPuncture(String puncture) throws CarPunctureException
  {
	  
	  if("puncture".equalsIgnoreCase(puncture))
	  {
		  throw new CarPunctureException("Car are puncture");
	  }
	  else 
	  {
		  System.out.println("car are move");
	  }
  }
  
  public static void CarHeat(int temperature) throws CarHeatException
  {
	  
	  if(temperature>50)
	  {
		  throw new CarHeatException("Car is heated more than 50 degree Celsius");
	  }
	  else 
	  {
		  System.out.println("Car temperature normal");
	  }
  }
}
