package ITC_DepositAndWithdraw;

public class Drawer extends Thread
{
  private Account account;

  public Drawer(Account account) 
  {
	super();
	this.account = account;
  }
  
  @Override
  public void run()
  {
	  int [] withdrawls= {1000,1500,2000};
	  for(int amount:withdrawls)
	  {
		 try
		 {
			 Thread.sleep(1000);
			 account.withdraw(amount);
		 }
		 catch (InterruptedException e)
		 {
			e.getStackTrace();
		 }
	  }
	  
  }
  
}
