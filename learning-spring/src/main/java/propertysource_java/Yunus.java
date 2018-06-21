package propertysource_java;

import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {

	private String artist;
	private String title;
	private int trackCount;
	private Class<CompactDisc> discClass;

	public Yunus(String artist, String title, int trackCount, Class<CompactDisc> discClass) {
		this.artist = artist;
		this.title = title;
		this.trackCount = trackCount;
		this.discClass = discClass;
	}

	@Override
	public void play() {
		System.out.printf("Playing %s - %s\nTrack Count: %d\nDisc Class: %s\n", artist, title, trackCount,
				discClass.getName());
	}

}
