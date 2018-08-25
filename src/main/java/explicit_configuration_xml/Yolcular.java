package explicit_configuration_xml;

import java.util.List;

public class Yolcular implements CompactDisc {
	private String artist;
	private String title;
	private List<String> tracks;

	public Yolcular(String artist, String title, List<String> tracks) {
		this.artist = artist;
		this.title = title;
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.printf("\nPlaying %s - %s\nTracks\n", artist, title);
		tracks.forEach(System.out::println);
		System.out.println();
	}
}
