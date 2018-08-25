package aspect.xml.simple_parameter_multi;

public class CdPlayer implements MediaPlayer {

	@Override
	public void play(String album, int track) {
		System.out.printf("Playing %s - %d\n", album, track);
	}

}
