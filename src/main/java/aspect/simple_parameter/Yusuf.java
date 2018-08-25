package aspect.simple_parameter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component
public class Yusuf implements CompactDisc {

	private List<String> tracks = Arrays.asList("Gel gel yanalim", "Askin ile asiklar", "Daglar ile taslar ile");

	@Override
	public void playAll() {
		IntStream.rangeClosed(1, tracks.size()).forEach(i -> {
			playTrack(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	public void playTrack(int trackNumber) {
		System.out.printf("Playing %s\n\n", tracks.get(trackNumber - 1));
	}

}
