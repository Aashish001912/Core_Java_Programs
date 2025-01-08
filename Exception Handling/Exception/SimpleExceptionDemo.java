package Exception;

import java.util.Scanner;

public class SimpleExceptionDemo
{

	public static void main(String[] args) 
	{
		try {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Integer  a : ");
        int a =sc.nextInt();
        System.out.println("Enter the first Integer b : ");
        int b =sc.nextInt();
        sc.close();
        System.out.println("you entered a="+a+" and b="+b);
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
