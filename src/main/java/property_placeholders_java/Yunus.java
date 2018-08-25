package property_placeholders_java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {

	private String artist;
	private String title;
	private int trackCount;

	public Yunus(@Value("${disc.artist}") String artist, @Value("${disc.title}") String title,
			@Value("${disc.trackCount}") String trackCount) {
		this.artist = artist;
		this.title = title;
		this.trackCount = Integer.parseInt(trackCount);
	}

	@Override
	public void play() {
		System.out.printf("Playing %s - %s\nTrack Count: %d\n", artist, title, trackCount);
	}
}
