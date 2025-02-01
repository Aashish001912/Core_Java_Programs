package MethodLevelSynchronization;

public class MethodLevelSynchronization
{
  public static void main(String[] args)
  {
	Table obj=new Table();  //lock is created
	Thread t1=new Thread()
	{		
 		@Override
 		public void run()
 		{
 			obj.printTable(5);
 		}
	};
	Thread t2=new Thread()
	{		
 		@Override
 		public void run()
 		{
 			obj.printTable(10);
 		}
	};
	t1.start();
	t2.start();
  }
}
