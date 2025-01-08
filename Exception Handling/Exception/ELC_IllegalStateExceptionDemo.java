package Exception;

public class ELC_IllegalStateExceptionDemo
{
   static void throwIllegalException( )
	   { 
		try
		{ 
		 throw new IllegalStateException("MyException"); 
		}
		catch(IllegalStateException objA)
		{
		 System.out.println("caught:" +objA); 
		}
   }
}
