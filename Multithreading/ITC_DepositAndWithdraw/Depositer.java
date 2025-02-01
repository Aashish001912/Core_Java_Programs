package ITC_DepositAndWithdraw;

public class Depositer extends Thread
{
  private Account account;

  public Depositer(Account account) 
  {
	super();
	this.account = account;
  }
  
  public void run()
  {
	  int depoists[]= {2000,2500,3000};
	  for(int amount:depoists)
	  {
		  try
		  {
			  Thread.sleep(1000);
			  account.deposit(amount);
		  }
		  catch (InterruptedException e)
		  {
			e.getStackTrace();
		  }
	  }
  }
  
}
