package Handling_IllegalArgumentException;

import java.util.Scanner;

public class AreaCalculator
{
  public static double calculateArea(double length,double width)
  {
	  if( length<=0 || width<=0)
	  {
		  throw new IllegalArgumentException("Dimension must be positive");
	  }
	  return length*width;
  }
   public static void main(String [] args)
   {   
	   Scanner sc=new Scanner(System.in);
	   try 
	   {
		   System.out.println("Enter the length:");
		   double length=sc.nextDouble();
		   
		   System.out.println("Enter the width:");
		   double width=sc.nextDouble();
		   
		   System.out.println("Area of rectangle is :"+calculateArea(length, width));
	   }
	   catch(IllegalArgumentException e)
	   {
		System.out.println("IllegalArgumentException caught: " + e.getMessage());   
	   }
	   catch(Exception e)
	   {
		   System.out.println("An error occured :"+e.getMessage());
	   }
	   finally
	   {
		sc.close();
	   }
   }
   
}
