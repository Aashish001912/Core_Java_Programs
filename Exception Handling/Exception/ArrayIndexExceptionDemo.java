package Exception;

//import java.util.Scanner;

public class ArrayIndexExceptionDemo
{
	public static void main(String[] args) 
	{
		try 
		{
			int a[] = new int[2];
			System.out.println("value of a[3] is :"+a[3]);
		}
		catch(Exception e)
		{ 
			e.printStackTrace(); //For complete Exception details
			System.out.println("---------------------------");
			System.out.println(e.getMessage()); //only for Exception message
			System.out.println("..............");
			System.out.println(e.toString());	
			
		}
}
}