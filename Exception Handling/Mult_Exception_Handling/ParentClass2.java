package Mult_Exception_Handling;

public class ParentClass2
{
	  public void loadingClass(String str) throws ClassNotFoundException
	   {
		   
		  Class.forName(str); 
	   }
}
