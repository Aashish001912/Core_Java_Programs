package Exception_Handling_In_CommandLineArgument;

public class CommandLineDivision {

	public static void main(String[] args) 
	{
		  try
		  {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			try
			{
				System.out.println("Division :"+a/b);
			}
			catch (ArithmeticException e)
			{
			 System.err.println("Divide By zero Problem");
			}
			finally 
			{
			 System.out.println("Divison is completed");	
			}
		}
		catch(NumberFormatException e1)
		{
	    	System.out.println("insufficient arguments or invalid input types");
		}
		catch(IllegalArgumentException e2)
		{
			System.out.println("Argument is not appropriat");
			}
		}
	}


