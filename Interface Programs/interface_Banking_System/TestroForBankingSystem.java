package interface_Banking_System;

public class TestroForBankingSystem 
{

	public static void main(String[] args) 
	{
        Bank sbi = new SBI(1000);
        Bank hdfc = new HDFC(2000);
        Bank icici = new ICICI(1500);
        
        Customer c= new Customer("john");
        c.deposit(sbi, 500);
        c.withdraw(sbi, 300);
        c.checkBalance(sbi);
        System.out.println("____________________________________________");
        c.deposit(hdfc, 1000);
        c.withdraw(hdfc, 500);
        c.checkBalance(hdfc);
        System.out.println("____________________________________________");
        c.deposit(icici, 200);
        c.withdraw(icici, 100);
        c.checkBalance(icici);
	}

}
