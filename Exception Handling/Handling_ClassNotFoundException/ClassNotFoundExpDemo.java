package Handling_ClassNotFoundException;

public class ClassNotFoundExpDemo
{
  public ClassNotFoundExpDemo(String forname)
  {
	  {
		  Class<?>c;
		  try 
		  {
	          c = Class.forName("java.lang.String\\");
	          System.out.println("Class Found ");
	      } 
		  catch (ClassNotFoundException e)
		  {
	          System.out.println("ClassNotFoundException caught!");
	          e.printStackTrace();
	      }
	  }
  }


}
