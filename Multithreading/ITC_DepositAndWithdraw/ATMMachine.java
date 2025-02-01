package ITC_DepositAndWithdraw;

public class ATMMachine 
{
	public static void main(String[] args) 
	{
	Account a1=new Account();
	Depositer d1=new Depositer(a1);
	Drawer d2=new Drawer(a1);
	d1.start();
	d2.start();
	

	}

}
