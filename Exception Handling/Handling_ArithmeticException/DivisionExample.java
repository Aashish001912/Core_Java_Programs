package Handling_ArithmeticException;

import java.util.Scanner;

public class DivisionExample 
{
 public static int performDivision(int a,int b) throws ArithmeticException 
 {
	return a/b;
	 
 }
 
 public static void main(String [] args)
 {   Scanner sc =new Scanner(System.in);
     int a=0,b=0;
	 try(sc)
	 {
	  	//performDivision(12, 8);
		 System.out.print("Enter the value of a :");
		 a=sc.nextInt();
		 System.out.print("Enter the value of b :");
		 b=sc.nextInt();
		 //int output=a/b;
	  	System.out.println("output is :"+performDivision(a, b));
	 }
	 catch (ArithmeticException e) 
	 {
	  System.err.println("ArithmeticException caught: Division by zero: dividend="+a+",divisor="+b);
	 }
 }
}
