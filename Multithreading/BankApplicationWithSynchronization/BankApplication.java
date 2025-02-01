package BankApplicationWithSynchronization;

import BankApplicationWithLimitation.Customer;

public class BankApplication 
{
	public static void main(String[] args)
	{
	 Customer c1=new Customer(20000);
	 Runnable r1=()->c1.withdraw();
	 Thread t1=new Thread(r1,"Scott");
	 Thread t2=new Thread(r1,"Smith");
	 t1.start();
	 t2.start();

	}

}
