package interface_Banking_System;

public class ICICI implements Bank 
{
    private double accountBalance;
    
	public ICICI(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("ICICI: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("ICICI: Withdrawn " + amount);
        } else {
            System.out.println("ICICI: Insufficient balance");
        }
    }

    @Override
    public double checkBalance() {
        return accountBalance;
    }

}
