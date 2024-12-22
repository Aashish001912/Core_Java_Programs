package interface_Banking_System;

public class SBI implements Bank 
{
	private double accountBalance;
     
	public SBI(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	@Override
	public void deposit(double amount) 
	{
		accountBalance=accountBalance+amount;
		System.out.println("Deposited Rs." + amount + " into SBI account. Current balance: Rs." + accountBalance);

	}

	@Override
	public void withdraw(double amount) 
	{
        if (amount > accountBalance) {
            System.out.println("Insufficient balance in SBI account.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrew Rs." + amount + " from SBI account. Remaining balance: Rs." + accountBalance);
        }

	}

	@Override
	public double checkBalance() 
	{
	
		return accountBalance;
	}

}
