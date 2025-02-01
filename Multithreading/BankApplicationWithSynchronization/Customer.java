package BankApplicationWithSynchronization;

public class Customer 
{
  private double availableBalance=20000;
  private double withdrawamount;
  
  public Customer(double withdrawamount) 
  {
	super();
	this.withdrawamount = withdrawamount;
  }
  public void withdraw()
  {
	  String name;
	  if(withdrawamount<=availableBalance)
	  {
		  name=Thread.currentThread().getName();
		  System.out.println(name+" has sucessfully withdraw :"+withdrawamount+" amount");
	      availableBalance=availableBalance-withdrawamount;
	  }
	  else
	  {
		  name=Thread.currentThread().getName();
		  System.out.println("Sorry!!!"+name+" you have insufficent balance");
	  }
	
  }
  
}