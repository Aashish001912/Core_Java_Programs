package ITC_PetrolPump;

public class Testor_PetrolPumpSimulation 
{
	public static void main(String[] args) throws InterruptedException 
	{
	PetrolPump pp=new PetrolPump();
	
	Car cars[]= {new Car("BMW", pp),new Car("Mercedes", pp),new Car("Land Rover", pp)};
	
	Thread t1=new Thread(cars[0]);
	Thread t2=new Thread(cars[1]);
	Thread t3=new Thread(cars[2]);

	t1.start();
	t1.join();
	t2.start();
	t2.join();
	t3.start();
	
	}

}
