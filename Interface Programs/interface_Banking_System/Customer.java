package interface_Banking_System;

public class Customer
{
  String name;
  public Customer(String name) 
  {
	super();
	this.name = name;
  }
  public void deposit(Bank bank ,double amount)
  {
      System.out.println(name+ " is depositing " + amount);
      bank.deposit(amount);  
  }
  public void withdraw(Bank bank, double amount) {
      System.out.println(name + " is withdrawing " + amount);
      bank.withdraw(amount);
  }

  public void checkBalance(Bank bank) {
      System.out.println(name + "'s balance is: " + bank.checkBalance());
  }
}
