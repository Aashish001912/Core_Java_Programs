package interface_SoftwareSystem_for_MediaPlayer;

public class TestorForSoftwareSystem_MediaPlayer {

	public static void main(String[] args)
	{
	MusucPlayer m1=new MusucPlayer("life");
	System.out.println("song title :"+m1.gettitle());
	m1.play();
	m1.stop();
	m1.puase();

	}

}
