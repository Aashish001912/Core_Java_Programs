package Exception;

import java.util.Scanner;

public class ExceptionHandlingDemo
{
 public static void handleExceptions(String input)
 {
	try
	{
		System.out.println("Length of the String is :"+input.length());
		int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);

	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException: Invalid input, not a number.");
        e.printStackTrace();
	}
	catch(NullPointerException e)
	{
		 System.out.println("NullPointerException: Attempted to operate on a null object.");
         e.printStackTrace();
	}
 }

public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String input = sc.nextLine();

    // Pass the input to handleExceptions method
    handleExceptions(input);

    // Close the scanner
    sc.close();
}
}