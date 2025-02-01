package ITC_BookAndCancelTicketSystem;

public class TicketSystem 
{
  private int availableTickets=5;
  
  public synchronized void bookTicket(int numberOfTickets) //numberOfTickets = 4
  {
      while (availableTickets < numberOfTickets) // 5  <  4
      {
         System.out.println("Not enough tickets available, Waiting for cancellation...");
          try 
          {
              wait(); 
          }
          catch (InterruptedException e) 
          {
              e.printStackTrace();
          }
      }
      availableTickets = availableTickets - numberOfTickets;  //5 - 4
      
      System.out.println("Booked " + numberOfTickets + " ticket(s). Remaining tickets: " + availableTickets);
      notify(); 
            
  }

  
  
  public synchronized void cancelTicket(int numberOfTickets)//numberOfTickets = 2 
  {
      availableTickets = availableTickets + numberOfTickets;
      System.out.println("Canceled " + numberOfTickets + " ticket(s). Available tickets: " + availableTickets);
      notify(); 
  }
}
