package StaticSynchronization;

public class MyTable 
{
  public  static  synchronized void printTable(int num) 
  {
	for(int i=1;i<=10;i++)
	{
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.err.println("Thread is Interupted");
		}
		System.out.println(num+" X "+i+" = "+(num*i));
	}
	System.out.println("________________________");
  }
}
