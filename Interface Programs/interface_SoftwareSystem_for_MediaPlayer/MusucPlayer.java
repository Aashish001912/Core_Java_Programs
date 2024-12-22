package interface_SoftwareSystem_for_MediaPlayer;

public class MusucPlayer implements AdvancedmediaPlayer
{
    String title;
    public String gettitle()
    {
    	return title;
    }
    
    
	public MusucPlayer(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() 
	{
	  System.out.println("Playing music :"+title);
	}

	@Override
	public void stop()
	{
		System.out.println("Stopping music :"+title);

	}

	@Override
	public void puase() 
	{
		System.out.println("Pauseing music :"+title);
		
	}

}
