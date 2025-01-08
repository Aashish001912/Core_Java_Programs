package Handling_Financial_Tansaction_Exception;

import java.util.Scanner;

public class FinancialTransaction
{
	public void processTransaction(double amount,long accountNo)
	{
	  	try 
	  	{
	  	 	if(amount <=0)
	  	 	{
	  	 		throw new IllegalArgumentException("Transaction amount must be postive");
	  	 	}
	  	 	else {
	  	 		System.out.println("Processing tansaction.....");
	  	 		System.out.println("transaction successfull");
	  	 	}
	  	}
	  	catch (NumberFormatException e)
	  	{
		System.out.println(e.getMessage());
		}
	  	catch (Exception e)
	  	{
		
		}
	}
	
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 FinancialTransaction F1=new FinancialTransaction();
	 try(sc)
	 {
		 System.out.print("Enter transaction amount: ");
         double  amount = sc.nextDouble();
         
         System.out.print("Enter account no:");
         long accountNo=sc.nextLong();
         F1.processTransaction(amount, accountNo);
	 }
	 catch (NumberFormatException e)
	 {
	   System.out.println(" Please enter a valid number for transaction amount");
	 }
	}

}
