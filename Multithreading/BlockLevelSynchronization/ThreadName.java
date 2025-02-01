package BlockLevelSynchronization;

public class ThreadName 
{
  public void printThreadName()
  {
	  
	  synchronized(this)
	  {
		  String name=Thread.currentThread().getName();
		  System.out.println("Running thread name is :"+name);
		  System.out.println("Synchronized block started by thread :"+name);
		  for(int i=1;i<=10;i++)
		  {
			  System.out.println("i value is:"+i+" by "+name);
		  }
		  System.out.println("Synchronized block ended by thread :"+name);
	  }
  }
}
