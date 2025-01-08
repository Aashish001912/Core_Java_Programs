package Mult_Exception_Handling;

public class ChildClass2 extends ParentClass2
{
	  @Override
	  public void loadingClass(String str) throws IllegalArgumentException
	   {
		  if(str.isEmpty())
		  {
			  throw new IllegalArgumentException("Class name cannot be empty");
		  }
		  else {
		  try 
		  {
			  Class.forName(str);
			  System.out.println("Class loaded successfully");
		  } 
		  catch (Exception e)
		  {
			System.out.println("Class Not found");
		  } 
		  
		  }
	   }
	

}
