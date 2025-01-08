package Car_related_custom_exception;



public class CarUser 
{

	public static void main(String[] args) 
	{
		//for some reasons 
        try
     	{
     	  CarTest.CarStopped("");
     	   
     	}
     	catch(CarStoppedException e)
     	{
     		System.out.println(e.getMessage());
     		
     	}
        
        //for puncture
        try
     	{
     	  CarTest.CarPuncture("Puncture");
     	   
     	}
     	catch(CarPunctureException p)
     	{
     		System.out.println(p.getMessage());
     		
     	}
        
        
        //for car heating
        try
     	{
     	  CarTest.CarHeat(400);
     	   
     	}
     	catch(CarHeatException c)
     	{
     		System.out.println(c.getMessage());
     		
     	}

	}

}
