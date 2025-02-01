package ITC_DepositAndWithdraw;

public class Account 
{
 private int balance=0;
 
 public synchronized void withdraw(int amount)
 {
	 while(balance<amount)
	 {
		 System.out.println("Thread is waiting state");
		 try
		 {
			 wait();
		 }
		 catch(InterruptedException e)
		 {
			 e.getStackTrace();
		 }
	 }
	 balance=balance-amount;
	 System.out.println("Withdraw amount is "+amount+" and available balance is "+balance);
	 notify();
 }
 
 public synchronized void deposit(int amount)
 {
	 balance=balance+amount;
	 System.out.println("deposit amount is "+amount+" and available balance is "+balance);
	 notify();
 }
}
 
