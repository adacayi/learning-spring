package spel_expressions_java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {

	private String artist;
	private String title;
	private int trackCount;

	public Yunus(@Value("#{systemProperties['disc.artist']}") String artist,
			@Value("#{systemProperties['disc.title']}") String title,
			@Value("#{systemProperties['disc.trackCount']}") String trackCount) {
		this.artist = artist;
		this.title = title;
		this.trackCount = Integer.parseInt(trackCount);
	}

	@Override
	public void play() {
		System.out.printf("Playing %s - %s\nTrack Count: %d\n", artist, title, trackCount);
	}
}
