package ITC_PetrolPump;

public class PetrolPump 
{
  public synchronized void refillCar(String carName)
  {
	  try 
	  {
	  System.out.println(carName+" Start refilling...");
	  Thread.sleep(3000);
	  System.out.println(carName+" Completed refilling...");
	  }
	  catch (InterruptedException e) 
	  {
		e.printStackTrace();
      }
  }
  
}
