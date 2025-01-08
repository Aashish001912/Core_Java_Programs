package Bank_Application_Custom_Exception;

public class BankAccount implements Bank 
{
  private long accountNumber;
  private double balance;
  
  public BankAccount(long accountNumber, double balance) 
  {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
  }
  

 public long getAccountNumber() 
 {
	return accountNumber;
 }


 public void setAccountNumber(long accountNumber) 
 {
	this.accountNumber = accountNumber;
 }


 public double getBalance()
 {
	return balance;
 }


 public void setBalance(double balance)
 {
	this.balance = balance;
 }


  @Override
  public void deposit(double amount) throws InvalidAmountException
  {
	if(amount<=0)
	{
		throw new InvalidAmountException("Deposit amount must be gerater than zero");
	}
	balance+=amount;
  }


  @Override
  public void withdraw(double amount) throws InsufficientFundsException 
  {
	
	if(amount>balance)
	{
		throw new InsufficientFundsException("Insufficient Balance in your account ");
	}
	balance-=amount;

  }


  @Override
  public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException,AccountNotFoundException, InvalidAmountException 
  {
	 if(toAccount == null) 
	{
          throw new AccountNotFoundException("Target account not found.");
    }
	if(amount>balance)
	{
		throw new InsufficientFundsException("Insufficient Funds for tarnsfer");
	}
	 if (amount <= 0) 
	 {
         throw new InvalidAmountException("Transfer amount must be greater than zero.");
     }
	toAccount.deposit(amount);
  }


  @Override
  public void applyForLaon(double amount) throws InvalidAmountException 
  {
	  if (amount <= 0) 
	  {
          throw new InvalidAmountException("Loan amount must be greater than zero.");
      }
      if (amount > 50000) 
      {
          throw new LoanNotAllowedException("Loan amount exceeds the allowed limit of 50000.");
      }
      if (balance < 50000) 
      {
          throw new LoanNotAllowedException("Loan not allowed as account balance is less than 50000.");
      }  
      balance+=amount;
  }


  @Override
  public double getbalance() 
  {
	return balance;
  }

  
}
