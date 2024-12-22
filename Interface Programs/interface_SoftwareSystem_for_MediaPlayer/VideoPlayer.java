package interface_SoftwareSystem_for_MediaPlayer;

public class VideoPlayer implements AdvancedmediaPlayer 
{

	@Override
	public void play() 
	{
		System.out.println("Playing music :");
	}

	@Override
	public void stop() 
	{
		System.out.println("Stopping music :");
	}

	@Override
	public void puase() 
	{
		System.out.println("Pausing music :");

	}

}
