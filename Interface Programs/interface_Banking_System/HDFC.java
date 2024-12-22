package interface_Banking_System;

public class HDFC implements Bank
{
	 private double accountBalance;
	 
	public HDFC(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	@Override
	public void deposit(double amount)
	{
		accountBalance += amount;
        System.out.println("Deposited Rs." + amount + " into HDFC account. Current balance: Rs." + accountBalance);

	}

	@Override
	public void withdraw(double amount)
	{
        if (amount > accountBalance) {
            System.out.println("Insufficient balance in HDFC account.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrew Rs." + amount + " from HDFC account. Remaining balance: Rs." + accountBalance);
        }

	}

	@Override
	public double checkBalance()
	{
		return accountBalance;
	}

}
