package Bank_Application_Custom_Exception;

import java.util.Scanner;

public class ATM
{

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 BankAccount account1=new BankAccount(00012,2000);
	 BankAccount account2=new BankAccount(00013, 3000);
     Customer cust1=new Customer("sohan", account1);
     Customer cust2=new Customer("rohan", account2);
     
     while(true)
     {
    	 System.out.println("1. Deposit");
    	 System.out.println("2. Withdraw");
    	 System.out.println("3. Transfer");
    	 System.out.println("4. LoanApplication");
    	 System.out.println("5. Check Balance");
    	 System.out.println("6. Exit");
    	 
    	 System.out.print("Enter Your Option ::");
    	 int opt=sc.nextInt();
    	 switch(opt)
    	 {
    	 case 1: 
    		 System.out.print("Enter Amount for deposit:");
    		 double amt=sc.nextDouble();
    		 try(sc)
    		 {
    			 
    		 cust1.getAccount().deposit(amt);
    		 }
    		 catch(Exception e)
    		 {
    			System.err.println(e.getMessage());
    		 }
    		 break;
    	 case 2:
    		 System.out.print("Enter Amount for withdraw:");
    		 double w=sc.nextDouble();
    		 try
    		 {
    			cust1.getAccount().withdraw(w); 
    		 }
    		 catch(Exception e)
    		 {
    			 System.err.println(e.getMessage());
    		 }
    		 break;
      	 case 3: 
//    		 System.out.print("Enter target Account number :");
    		 BankAccount targetAccount=null;
    		 
    		 System.out.print("Enter Amount for Transfer:");
    		 double trns=sc.nextDouble();
    		 try
    		 {
    			 cust2.getAccount().transfer(targetAccount, trns);
    		 }
    		 catch(Exception e)
    		 {
    			System.err.println(e.getMessage()); 
    		 }
    		 break;
    	 case 4:
    		 System.out.print("Enter Amount for loan:");
    		 double ln=sc.nextDouble();
    		 try
    		 {
    			 cust1.getAccount().applyForLaon(ln);
    		 }
    		 catch(Exception e)
    		 {
    			 System.err.println(e.getMessage());
    		 }
    		 
    		 break;
    	 case 5: double getbalance = cust1.getAccount().getbalance();
    	 	System.out.println("Your Balance is :"+getbalance);
    	 	break;
    	 case 6:
    		 System.err.println("Exiting from Application");
    		 System.exit(0);
    		 
    	 }
     }
	}
	
    

}
