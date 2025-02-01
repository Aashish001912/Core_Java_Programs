package BlockLevelSynchronization;

public class BlockLevelSynchronization 
{
	public static void main(String[] args) 
	{
	 ThreadName th=new ThreadName();
	 Runnable r1=()->th.printThreadName();
	 Thread t1=new Thread(r1,"Smith");
	 Thread t2=new Thread(r1,"scott");
	 t1.start();
	 t2.start();
	 
	}

}
