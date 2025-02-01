package ITC_BookAndCancelTicketSystem;

public class Tester_for_TicketSystem 
{
	public static void main(String[] args) 
	{
	 TicketSystem ts=new TicketSystem();
	 Thread bookingThread = new Thread()
     {
     	@Override
         public void run() 
     	{
             int[] ticketsToBook = {2, 4, 4};  
             
             for (int ticket : ticketsToBook) //ticket = 4
             {
                 ts.bookTicket(ticket);
                 try 
                 {
                     Thread.sleep(1000); // give some time b/w booking
                 } 
                 catch (InterruptedException e)
                 {
                     e.printStackTrace();
                 }
             }
     	 }        	
     };
	 
	 bookingThread.start();
	 
	 Thread cancellationThread = new Thread()
    	{
     	@Override
         public void run() 
     	{
             int[] ticketsToCancel = {1, 3, 2};
             
             for (int ticket : ticketsToCancel) //ticket = 2
             {
                 ts.cancelTicket(ticket);
                 try 
                 {
                     Thread.sleep(1000);  // give some time b/w cancellation
                 } 
                 catch (InterruptedException e) 
                 {
                     e.printStackTrace();
                 }
             }
         }
     };
     
 
     cancellationThread.start();
     
	}

}
