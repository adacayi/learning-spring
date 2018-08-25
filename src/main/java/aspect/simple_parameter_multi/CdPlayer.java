package aspect.simple_parameter_multi;

import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer {

	@Override
	public void play(String album, int track) {
		System.out.printf("Playing %s - %d\n", album, track);
	}

}
