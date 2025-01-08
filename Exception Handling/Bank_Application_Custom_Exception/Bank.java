package Bank_Application_Custom_Exception;

public interface Bank 
{
 void deposit(double amount)throws InvalidAmountException;
 void withdraw(double amount)throws InsufficientFundsException;
 void transfer(BankAccount toAccount,double amount) throws InsufficientFundsException,AccountNotFoundException, InvalidAmountException;
 void applyForLaon(double amount)throws InvalidAmountException;
 double getbalance();
}
