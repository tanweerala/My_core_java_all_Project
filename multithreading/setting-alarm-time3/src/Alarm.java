import java.applet.*;
public class Alarm 
{
	AudioClip clip=Applet.newAudioClip(getClass().getResource("sound/aa.WAV"));
	public void ringAlarm()
	{
		//System.out.println("Ringing....");
		clip.play();
	}
}
