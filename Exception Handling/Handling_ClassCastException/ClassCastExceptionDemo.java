package Handling_ClassCastException;


public class ClassCastExceptionDemo 
{
  public static void handleClassCastException()
  {
	  Object [] objests= {"jghj",true,976876.876,'j',876,87676l,654.8f};
	 
      for(Object obj:objests )
      {
    	  try
    	  {
    		 String str=(String)obj;
    		 System.out.println("Casting succesful :"+str);
    	  }
    	  catch (ClassCastException e)
    	  {
			e.printStackTrace();
		  }
      }
	  
  }
}
