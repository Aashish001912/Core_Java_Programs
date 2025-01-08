package interfacMobilePhoneSIMCardInteraction;

public class Airtel implements SIMCard 
{
	long phno=(long)Math.random()*9876544187l;
    boolean isActive;

	public Airtel(boolean isActive) {
		super();
		this.isActive = isActive;
	}

	@Override
	public long gettingPhoneNumber() 
	{
	
		return phno;
	}

	@Override
	public void getnetworkProvider()
	{
		System.out.println("Airtel");
		
	}

	@Override
	public void activation() 
	{
		System.out.println("Sim is active");
		
	}

	@Override
	public void deactivation()
	{
		System.out.println("Sim is deactive");
		
	}
    
	

}
