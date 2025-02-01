package StaticSynchronization;

public class Testor_For_MyTable 
{
	public static void main(String[] args) 
	{
       Thread t1=new Thread()
   	   {
    	@Override
        public void run()
        {
        	MyTable.printTable(5);
        }
       };
    	
       Thread t2=new Thread()
   	   {
    	@Override
        public void run()
        {
        	MyTable.printTable(10);
        }
       };
       
       Runnable r3=()->MyTable.printTable(15);
       Thread t3=new Thread(r3);
       
       t1.start();
       t2.start();
       t3.start();
       
    		   
	}

}
