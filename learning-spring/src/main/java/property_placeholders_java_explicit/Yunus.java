package property_placeholders_java_explicit;

public class Yunus implements CompactDisc {

	private String artist;
	private String title;
	private int trackCount;

	public Yunus(String artist, String title, String trackCount) {
		this.artist = artist;
		this.title = title;
		this.trackCount = Integer.parseInt(trackCount);
	}

	@Override
	public void play() {
		System.out.printf("Playing %s - %s\nTrack Count: %d\n", artist, title, trackCount);
	}
}
