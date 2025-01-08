package Bank_Application_Custom_Exception;

public class Customer 
{
  private  String  name;
  private BankAccount account;
  public Customer(String name, BankAccount account)
  {
	super();
	this.name = name;
	this.account = account;
  }
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public BankAccount getAccount() 
  {
      return account;
  }
}
