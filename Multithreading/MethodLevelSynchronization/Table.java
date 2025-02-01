package MethodLevelSynchronization;

public class Table 
{
 public synchronized void printTable(int num)
 {
	 for(int i=1;i<=10;i++)
	 {
		 try
		 {
			 Thread.sleep(100);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println(num+" X "+i+" = "+(num*i));
		 
	 }
	 String name=Thread.currentThread().getName();
	 System.out.println(name+"Thread is completed");
 }
}
